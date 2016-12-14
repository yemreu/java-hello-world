
package javaswinggui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;

public class JavaSwingGUIGrafikler extends JLabel {

    public JavaSwingGUIGrafikler(String s) {
        super(s);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("Verdena",Font.BOLD,40));
        g.drawLine(0,0,200,150);
    }
    
}
