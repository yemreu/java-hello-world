
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JavaSwingGUIKarma extends JFrame {

    public JavaSwingGUIKarma(){
        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("buton 1");
        JButton button2 = new JButton("buton 2");
        JButton button3 = new JButton("buton 3");
        JButton button4 = new JButton("buton 4");
        buttonPanel.setLayout(new GridLayout(1,4));
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        
        JPanel textPanel = new JPanel();
        JLabel label = new JLabel("Label");
        JTextField text = new JTextField(15);
        textPanel.add(label);
        textPanel.add(text);
        
        setLayout(new BorderLayout());
        add(buttonPanel,BorderLayout.CENTER);
        add(textPanel,BorderLayout.NORTH);
    }
    
    
    
    
}
