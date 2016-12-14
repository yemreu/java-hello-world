
package javaswinggui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class JavaSwingGUIBorderLayout extends JFrame {

    public JavaSwingGUIBorderLayout() {
        BorderLayout layout = new BorderLayout(40,40);
        setLayout(layout);
        add(new JButton("WEST"),BorderLayout.WEST);
        add(new JButton("SOUTH"),BorderLayout.SOUTH);
        add(new JButton("NORTH"),BorderLayout.NORTH);
        add(new JButton("EAST"),BorderLayout.EAST);
        add(new JButton("CENTER"),BorderLayout.CENTER);
    }
    
    
}
