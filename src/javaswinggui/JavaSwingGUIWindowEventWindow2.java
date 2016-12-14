
package javaswinggui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class JavaSwingGUIWindowEventWindow2 extends JFrame {
    
    public JavaSwingGUIWindowEventWindow2() {
        
        GUIWindowListener listener = new GUIWindowListener();
        addWindowListener(listener);
    }
    
    private class GUIWindowListener extends WindowAdapter{
        @Override
        public void windowOpened(WindowEvent we) {
            System.out.println("Pencere açıldı.");
        }

        @Override
        public void windowClosing(WindowEvent we) {
            System.out.println("Pencere kapatıldı.");
        }
    }
}
