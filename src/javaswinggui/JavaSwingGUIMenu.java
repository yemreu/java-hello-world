
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class JavaSwingGUIMenu extends JFrame implements ActionListener, ItemListener{
    
    JTextArea cikti;
    JScrollPane scrollPane;
    String newLine = "\n";
        
    public JavaSwingGUIMenu(){
        
    }
    
    public JMenuBar menuBar(){
        JMenuBar menuBar;
        JMenu menu, altMenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem radioMenuItem;
        JCheckBoxMenuItem checkMenuItem;
        
        menuBar = new JMenuBar();
        menu = new JMenu("Menu1");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("bu uygulamada menulerin sahip olabilecekleri gösrerilir.");
        menuBar.add(menu);
        
        menuItem = new JMenuItem("İkonsuz menu",KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription("burada iş yapılmamaktadır");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        ImageIcon icon = ikonOlustur("/resim/sun_java.png");
        menuItem = new JMenuItem("yazı ve ikon alan menu",icon);
        menuItem.setMnemonic(KeyEvent.VK_B);
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menu.addSeparator();
        
        ButtonGroup group = new ButtonGroup();
        radioMenuItem = new JRadioButtonMenuItem("Menu Radyo Butonu");
        radioMenuItem.setSelected(true);
        radioMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(radioMenuItem);
        radioMenuItem.addActionListener(this);
        menu.add(radioMenuItem);
        
        menu.addSeparator();
        
        checkMenuItem = new JCheckBoxMenuItem("Menu Checkbox");
        checkMenuItem.setMnemonic(KeyEvent.VK_C);
        checkMenuItem.addItemListener(this);
        menu.add(checkMenuItem);
        
        menu.addSeparator();
        
        altMenu = new JMenu("Altmenu1");
        altMenu.setMnemonic(KeyEvent.VK_S);
        menuItem = new JMenuItem("altmenu menu1");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.ALT_MASK));
        menuItem.addActionListener(this);
        altMenu.add(menuItem);
        menuItem = new JMenuItem("altmenu menu2");
        menuItem.addActionListener(this);
        altMenu.add(menuItem);
        menu.add(altMenu);
        
        menu = new JMenu("menu2");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription("bu menu iş yapmayacak");
        menuBar.add(menu);
        
        return menuBar;
    }
    
    public Container kapOlustur(){
        JPanel kapOlustur = new JPanel(new BorderLayout());
        kapOlustur.setOpaque(true);
        
        cikti = new JTextArea(5,30);
        cikti.setEditable(false);
        scrollPane = new JScrollPane(cikti);
        kapOlustur.add(scrollPane,BorderLayout.CENTER);
        return kapOlustur;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem kaynak = (JMenuItem)(e.getSource());
        String s = "Action event oluştu. "+newLine+" Olay kaynağı: "+"("+getSinifAdi(kaynak)+" nesnesi: )";
        cikti.append(s+newLine);
        cikti.setCaretPosition(cikti.getDocument().getLength());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JMenuItem kaynak2 = (JMenuItem)(e.getSource());
        String s ="Item event oluştu. "+ newLine +" Olay kaynağı: "+kaynak2.getText()+"("+getSinifAdi(kaynak2)+"nesnesi: "+newLine+"Yeni durum"+((e.getStateChange()==ItemEvent.SELECTED)?"Secildi":"Secilmedi");
        cikti.append(s+newLine);
        
        cikti.setCaretPosition(cikti.getDocument().getLength());
    }
    
    public String getSinifAdi(Object o){
        String classString = o.getClass().getName();
        int dotIndex = classString.lastIndexOf(".");
        return classString.substring(dotIndex+1);
    }
    
    protected static ImageIcon ikonOlustur(String s){
        java.net.URL imgURL = JavaSwingGUIMenu.class.getResource(s);
        if(imgURL!=null){
            return new ImageIcon(imgURL);
        }
        else{
            System.err.println("dosya yolu bulunamadı,"+s);
        }
        return null;
    }
    
    
}
