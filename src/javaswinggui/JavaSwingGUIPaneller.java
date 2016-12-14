
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaSwingGUIPaneller extends JFrame {

    public JavaSwingGUIPaneller() {
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(2,2));
        
        rightPanel.add(new JButton("right1"));
        rightPanel.add(new JButton("right2"));
        rightPanel.add(new JButton("right3"));
        rightPanel.add(new JButton("right4"));
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(rightPanel);
        
        panel.add(new JButton("LEFT,WEST"),BorderLayout.WEST);
        add(panel);
    }
    
}
