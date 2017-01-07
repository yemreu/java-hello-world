
package kkjnetworkserver;

import java.awt.BorderLayout;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import kkjnetworknesne.KareAlma;


public class KKJNetworkServerSerializable extends JFrame {

    private JTextArea textArea = new JTextArea();
    
    public KKJNetworkServerSerializable() {
        setTitle("Server | Serializable");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea));
        
        try {
            ServerSocket serverSocket = new ServerSocket(9991);
            textArea.append("Sunucu: "+ new Date()+" tarihinde çalışmaya başladı.\n");
            serverSocket.setSoTimeout(15000);
            Socket socket = serverSocket.accept();
            InetAddress inetAdres = socket.getInetAddress();
            textArea.append("Sunucuya bağlanan istemci adı: "+inetAdres.getHostName()+"\nSunucuya bağlanan istemci adresi: "+inetAdres.getHostAddress()+"\n");
            ObjectInputStream reader = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream writer = new ObjectOutputStream(socket.getOutputStream());
            while(true){
                KareAlma sqr = (KareAlma) reader.readObject();
                sqr.getSqr();
                writer.writeObject(sqr);
                textArea.append("X: "+sqr.getX()+" X^2: "+sqr.getSqr()+"\n");
            }
        } catch (IOException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KKJNetworkServerSerializable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

