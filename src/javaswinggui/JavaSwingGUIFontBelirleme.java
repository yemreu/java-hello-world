
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;


public class JavaSwingGUIFontBelirleme extends JFrame {

    public JavaSwingGUIFontBelirleme() {
        BorderLayout layout = new BorderLayout(40,40);
        setLayout(layout);
        
        add(new JButton("WEST"),BorderLayout.WEST);
        add(new JButton("EAST"), BorderLayout.EAST);
        add(new JButton("SOUTH"),BorderLayout.SOUTH);
        add(new JButton("NORTH"),BorderLayout.NORTH);
        
        JButton center = new JButton("CENTER");
        center.setBackground(Color.YELLOW);
        add(center,BorderLayout.CENTER);
        
        Font font = new Font("Verdana",Font.ITALIC,24);
        center.setFont(font);
    }
    
}
