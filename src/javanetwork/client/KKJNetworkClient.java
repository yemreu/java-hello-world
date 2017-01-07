
package kkjnetworkclient;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KKJNetworkClient extends JFrame{
    
    private JTextField textField = new JTextField();
    private JTextArea textArea = new JTextArea();
    private DataInputStream reader;
    private DataOutputStream writer;
    
    public KKJNetworkClient(){
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
            Socket clientSocket = new Socket("localhost",9999);
            reader = new DataInputStream(clientSocket.getInputStream());
            writer = new DataOutputStream(clientSocket.getOutputStream());
        } catch (IOException e) {
            textArea.append(e.getMessage()+"\n");
        }
    }
    
    private class TextFieldListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double x = Double.parseDouble(textField.getText().trim());
                writer.writeDouble(x);
                double sqr = reader.readDouble();
                textArea.append("X: "+x+" X^2: "+sqr+"\n");
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
        
    }
    
}
