
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class JavaSwingGUITextFieldWindow extends JFrame {

    private JavaSwingGUIDrawingPanel drawingPanel = new JavaSwingGUIDrawingPanel("Hello World");
    
    private JButton left = new JButton("LEFT");
    private JButton right = new JButton("RIGHT");
    private JButton up = new JButton("UP");
    private JButton down = new JButton("DOWN");
    
    private JTextField textField = new JTextField(5);
    
    public JavaSwingGUITextFieldWindow() {
        drawingPanel.setBackground(Color.yellow);
        
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout(5,0));
        JLabel textLabel = new JLabel("Mesaj giriniz:");
        textPanel.add(textLabel,BorderLayout.NORTH);
        textPanel.add(textField,BorderLayout.CENTER);
        
        TextListener textListener = new TextListener();
        textField.addActionListener(textListener);
        
        left.setIcon(new ImageIcon(getClass().getResource("/resim/left.png")));
        left.setHorizontalTextPosition(SwingConstants.RIGHT);
        right.setIcon(new ImageIcon(getClass().getResource("/resim/right.png")));
        right.setHorizontalTextPosition(SwingConstants.LEFT);
        up.setIcon(new ImageIcon(getClass().getResource("/resim/up.png")));
        up.setHorizontalTextPosition(SwingConstants.CENTER);
        down.setIcon(new ImageIcon(getClass().getResource("/resim/down.png")));
        down.setHorizontalTextPosition(SwingConstants.CENTER);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.add(right,BorderLayout.EAST);
        buttonPanel.add(left,BorderLayout.WEST);
        buttonPanel.add(up,BorderLayout.NORTH);
        buttonPanel.add(down,BorderLayout.SOUTH);
        
        left.setMnemonic('A');
        right.setMnemonic('D');
        up.setMnemonic('W');
        down.setMnemonic('S');
        
        left.setToolTipText("Yazıyı sola kaydırır.");
        right.setToolTipText("Yazıyı sağa kaydırır.");
        up.setToolTipText("Yazıyı yukarı kaydırır.");
        down.setToolTipText("Yazıyı aşağı kaydırır.");
        
        ButtonListener btnListener = new ButtonListener();
        left.addActionListener(btnListener);
        right.addActionListener(btnListener);
        up.addActionListener(btnListener);
        down.addActionListener(btnListener);
        
        setLayout(new BorderLayout());
        add(drawingPanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
        add(textPanel,BorderLayout.NORTH);
    }
    
    private class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equalsIgnoreCase("up")){
                drawingPanel.up();
            }
            else if(e.getActionCommand().equalsIgnoreCase("down")){
                drawingPanel.down();
            }
            else if(e.getActionCommand().equalsIgnoreCase("left")){
                drawingPanel.left();
            }
            else if(e.getActionCommand().equalsIgnoreCase("right")){
                drawingPanel.right();
            }
        }
    }
    
    private class TextListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            drawingPanel.setText(textField.getText());
        }
        
    }
    
    
}
