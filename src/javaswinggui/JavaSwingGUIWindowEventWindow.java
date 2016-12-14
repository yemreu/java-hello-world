
package javaswinggui;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;


public class JavaSwingGUIWindowEventWindow extends JFrame{

    public JavaSwingGUIWindowEventWindow() {
        GUIWindowListener listener = new GUIWindowListener();
        addWindowListener(listener);
    }
    
    private class GUIWindowListener implements WindowListener{

        @Override
        public void windowOpened(WindowEvent we) {
            System.out.println("Pencere açıldı.");
        }

        @Override
        public void windowClosing(WindowEvent we) {
            System.out.println("Pencere kapatıldı.");
        }

        @Override
        public void windowClosed(WindowEvent we) {
        }

        @Override
        public void windowIconified(WindowEvent we) {
        }

        @Override
        public void windowDeiconified(WindowEvent we) {
        }

        @Override
        public void windowActivated(WindowEvent we) {
        }

        @Override
        public void windowDeactivated(WindowEvent we) {
        }

        
        
    }
    
    
}
