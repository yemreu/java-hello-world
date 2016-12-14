
package javaswinggui;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class JavaSwingGUIKeyboardPanelWindow extends JFrame {

    public JavaSwingGUIKeyboardPanelWindow() {
        JavaSwingGUIKeyboardPanel panel = new JavaSwingGUIKeyboardPanel();
        setLayout(new BorderLayout());
        add(panel,BorderLayout.CENTER);
        panel.setFocusable(true);
    }
    
}
