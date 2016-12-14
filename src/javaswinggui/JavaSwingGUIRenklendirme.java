
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;


public class JavaSwingGUIRenklendirme extends JFrame {

    public JavaSwingGUIRenklendirme(){
        JButton center = new JButton("Center");
        
        Color color = new Color(100,150,250);
        
        center.setBackground(color);
        BorderLayout layout = new BorderLayout(40,40);
        setLayout(layout);
        add(center,BorderLayout.CENTER);
        add(new JButton("WEST"),BorderLayout.WEST);
        add(new JButton("SOUTH"),BorderLayout.SOUTH);
        add(new JButton("NORTH"),BorderLayout.NORTH);
        
        JButton east = new JButton("EAST");
        east.setBackground(Color.ORANGE);
        add(east,BorderLayout.EAST);
    }
    
    
}
