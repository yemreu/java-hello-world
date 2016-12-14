
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;


public class JavaSwingGUIDataPanel extends JPanel {

    private JLabel dataLabel = new JLabel();
    private JTextArea textArea = new JTextArea();
    
    public JavaSwingGUIDataPanel() {
        dataLabel.setFont(new Font("Verdana",Font.BOLD,24));
        dataLabel.setForeground(Color.red);
        textArea.setFont(new Font("Verdana",Font.BOLD,24));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        
        JScrollPane scroll = new JScrollPane(textArea);
        
        setLayout(new BorderLayout(5,5));
        add(scroll,BorderLayout.CENTER);
        add(dataLabel,BorderLayout.NORTH);
    }
    
    public void setTaText(String t){
        textArea.setText(t);
    }
    
    public void setDlText(String t){
        dataLabel.setText(t);
    }
    
}
