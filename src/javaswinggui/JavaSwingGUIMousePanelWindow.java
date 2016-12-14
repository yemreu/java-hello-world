
package javaswinggui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class JavaSwingGUIMousePanelWindow extends JFrame {

    public JavaSwingGUIMousePanelWindow() {
        JavaSwingGUIMousePanel panel = new JavaSwingGUIMousePanel("SElamm");
        setLayout(new BorderLayout());
        add(panel,BorderLayout.CENTER);
    }
    
}
