
package javaswinggui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaSwingGUIActionEventWindow extends JFrame {
     private JButton button1 = new JButton("1");
        private JButton button2 = new JButton("2");
        
        
    public JavaSwingGUIActionEventWindow() {
       setLayout(new FlowLayout());
       add(button1);
       add(button2);
       
       Listener listener = new Listener();
       button1.addActionListener(listener);
       button2.addActionListener(listener);
       
    }
    
    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            Date date = new Date(e.getWhen());
            System.out.println("Hangi buton: "+button+" Ne zaman basıldı:"+date);
        }
        
    }
    
}
