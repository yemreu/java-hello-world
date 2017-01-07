
package kkjnetworkclient;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import kkjnetworknesne.KareAlma;

public class KKJNetworkClientSerializable extends JFrame{
    
    private JTextField textField = new JTextField();
    private JTextArea textArea = new JTextArea();
    private ObjectInputStream reader;
    private ObjectOutputStream writer;
    
    public KKJNetworkClientSerializable(){
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(textField,BorderLayout.CENTER);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(new JLabel("bir değer giriniz: "),BorderLayout.WEST);
        
        setLayout(new BorderLayout());
        add(panel,BorderLayout.NORTH);
        add(new JScrollPane(textArea),BorderLayout.CENTER);
        
        textField.addActionListener(new TextFieldListener());
        
        try {
            Socket clientSocket = new Socket("localhost",9991);
            reader = new ObjectInputStream(clientSocket.getInputStream());
            writer = new ObjectOutputStream(clientSocket.getOutputStream());
        } catch (IOException e) {
            textArea.append(e.getMessage()+"\n");
        }
    }
    
    private class TextFieldListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double x = Double.parseDouble(textField.getText().trim());
                KareAlma sqr = new KareAlma(x);
                writer.writeObject(sqr);
                sqr = (KareAlma) reader.readObject();
                textArea.append("x değeri: "+ x+"\nSunucunun gönderdiği değer: "+sqr.getSqr()+"\n");
            } catch (IOException ex) {
                System.err.println(ex);
            } catch (ClassNotFoundException ex) {
                System.err.println(ex);     
            }
        }
        
    }
    
}
