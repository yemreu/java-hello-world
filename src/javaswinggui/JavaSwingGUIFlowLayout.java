
package javaswinggui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JavaSwingGUIFlowLayout extends JFrame {

    public JavaSwingGUIFlowLayout() {
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT,10,20);
        setLayout(layout);
        add(new JLabel("İsim: "));
        add(new JTextField(25));
        add(new JLabel("Soyisim: "));
        add(new JTextField(25));
        add(new JLabel("Yaş: "));
        add(new JTextField(3));
    }
    
}
