
package kkjnetworkserver;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class KKJNetworkServer extends JFrame {

    private JTextArea textArea = new JTextArea();
    
    public KKJNetworkServer() {
        setTitle("Server");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea));
        
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            textArea.append("Server: "+new Date()+" tarihinde çalışmaya başladı.\n");
            Socket socket = serverSocket.accept();
            InetAddress inetAdres = socket.getInetAddress();
            textArea.append("Sunucuya bağlanan istemci adı: "+inetAdres.getHostName()+"\nSunucuya bağlanan istemci adresi: "+inetAdres.getHostAddress()+"\n");
            DataInputStream reader = new DataInputStream(socket.getInputStream());
            DataOutputStream writer = new DataOutputStream(socket.getOutputStream());
            while(true){
                double x  = reader.readDouble();
                double sqr = x * x;
                writer.writeDouble(sqr);
                textArea.append("X: "+x+" X^2: "+sqr+"\n");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
