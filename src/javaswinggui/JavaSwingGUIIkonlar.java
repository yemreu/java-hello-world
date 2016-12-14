
package javaswinggui;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JavaSwingGUIIkonlar extends JFrame{

   private ImageIcon ikon;
        
    public JavaSwingGUIIkonlar() {
        try {
            
        ikon = new ImageIcon(getClass().getResource("/resim/sun_java.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        setLayout(new GridLayout(2,2,5,5));
        add(new JLabel(ikon));
        add(new JButton(ikon));
    }
    
}
