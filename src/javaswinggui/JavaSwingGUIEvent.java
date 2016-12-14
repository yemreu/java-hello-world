
package javaswinggui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaSwingGUIEvent extends JFrame {

    public JavaSwingGUIEvent() {
        setLayout(new FlowLayout());
        
        JButton button = new JButton("Bas");
        add(button);
        
        ButtonListener listener = new ButtonListener();
        button.addActionListener(listener);
    }
    
    private class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Hello World");
        }
        
    }
    
}
