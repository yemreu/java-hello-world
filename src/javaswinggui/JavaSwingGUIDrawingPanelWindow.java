
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class JavaSwingGUIDrawingPanelWindow extends JFrame {

    private JavaSwingGUIDrawingPanel drawingPanel = new JavaSwingGUIDrawingPanel("Helloo caağnm");
        
    private JButton left = new JButton("LEFT");
    private JButton right = new JButton("RIGHT");
    private JButton up = new JButton("UP");
    private JButton down = new JButton("DOWN");
    
    private JCheckBox bold = new JCheckBox("Bold");
    private JCheckBox italic = new JCheckBox("Italic");
    
    private JRadioButton redRB = new JRadioButton("Red");
    private JRadioButton greenRB = new JRadioButton("Green");
    private JRadioButton blueRB = new JRadioButton("Blue");
    
    
    public JavaSwingGUIDrawingPanelWindow() {
        drawingPanel.setBackground(Color.yellow);
        
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
        
        JPanel checkboxPanel = new JPanel();
        checkboxPanel.setLayout(new GridLayout(2,1));
        checkboxPanel.add(bold);
        checkboxPanel.add(italic);
        
        bold.setMnemonic('K');
        italic.setMnemonic('I');
        
        CheckBoxListener chbListener = new CheckBoxListener();
        bold.addActionListener(chbListener);
        italic.addActionListener(chbListener);
        
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3,1));
        radioPanel.add(redRB);
        radioPanel.add(greenRB);
        radioPanel.add(blueRB);
        
        redRB.setMnemonic('R');
        greenRB.setMnemonic('G');
        blueRB.setMnemonic('B');
        
        RadioButtonListener rbListener = new RadioButtonListener();
        redRB.addActionListener(rbListener);
        greenRB.addActionListener(rbListener);
        blueRB.addActionListener(rbListener);
        
        setLayout(new BorderLayout());
        add(drawingPanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
        add(checkboxPanel,BorderLayout.EAST);
        add(radioPanel,BorderLayout.WEST);
    }
    
    public void fontAta(){
        int yaziTipi = Font.ROMAN_BASELINE;        
        yaziTipi += (bold.isSelected()?Font.BOLD:Font.ROMAN_BASELINE);
        yaziTipi += (italic.isSelected()?Font.ITALIC:Font.ROMAN_BASELINE);
        
        Font drawingPanelFont = drawingPanel.getFont();
        Font yeniFont = new Font(drawingPanelFont.getName(),yaziTipi,drawingPanelFont.getSize());
        drawingPanel.setFont(yeniFont);
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
    
    private class CheckBoxListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            fontAta();
        }
        
    }
    
    private class RadioButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if(o == redRB){
                drawingPanel.setForeground(Color.RED);
            }
            else if(o == greenRB){
                drawingPanel.setForeground(Color.GREEN);
            }
            else if(o == blueRB){
                drawingPanel.setForeground(Color.BLUE);
            }
        }
        
    }
    
    
    
}
