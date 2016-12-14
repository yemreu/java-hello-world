
package javaswinggui;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JavaSwingGUIGridLayout extends JFrame {

    public JavaSwingGUIGridLayout() {
        GridLayout layout = new GridLayout(3,2,10,45);
        setLayout(layout);
        add(new JLabel("İsim: "));
        add(new JTextField(25));
        add(new JLabel("Soyisim: "));
        add(new JTextField(25));
        add(new JLabel("Yaş: "));
        add(new JTextField(3));
    }
    
    
    
}
