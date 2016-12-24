
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JavaSwingGUICardLayout extends JFrame implements ActionListener{

    private CardLayout layout;
    private JPanel merkeziPanel;
    
    public JavaSwingGUICardLayout(){
        layout = new CardLayout();
        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("kart1");
        button1.addActionListener(this);
        buttonPanel.add(button1);
        JButton button2 = new JButton("kart2");
        button2.addActionListener(this);
        buttonPanel.add(button2);
        merkeziPanel = new JPanel();
        merkeziPanel.setLayout(layout);
        JLabel label1 = new JLabel("1. paneli açtınız");
        label1.setForeground(Color.blue);
        merkeziPanel.add(label1, "label1");
        JLabel label2 = new JLabel("2. paneli açtınız");
        label2.setForeground(Color.red);
        merkeziPanel.add(label2, "label2");
        setLayout(new BorderLayout());
        add(buttonPanel,BorderLayout.NORTH);
        add(merkeziPanel,BorderLayout.CENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("kart1")){
            layout.show(merkeziPanel, "label1");
        }
        else if(e.getActionCommand().equals("kart2")){
            layout.show(merkeziPanel,"label2");
        }
    }
    
}
