
package javaswinggui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.List;
import java.util.Vector;
import javafx.scene.control.SelectionModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class JavaSwingGUIListeEkleme extends JFrame {
    
    private String[] sifatlar = {"ben","sen","o","biz","siz","onlar"};
    
    private JList liste1 = new JList(sifatlar);
    private JList liste2 = new JList();

    public JavaSwingGUIListeEkleme(){
        setLayout(new BorderLayout());
        liste1.setBackground(Color.red);
        liste1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane1 = new JScrollPane(liste1);
        JScrollPane scrollPane2 = new JScrollPane(liste2);
        add(scrollPane1,BorderLayout.WEST);
        add(scrollPane2,BorderLayout.EAST);
        
        ListeListener listener = new ListeListener();
        liste1.addListSelectionListener(listener);
    }
    
    private class ListeListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent lse) {
//            List secilmisler = ilste1.getSelectedValuesList();
//            liste2.setListData(secilmisler.toArray());
            DefaultListModel a = new DefaultListModel();
            liste2.setModel(a);
            liste1.getSelectedValuesList().forEach(a::addElement);
            
        }
        
    }
    
    
}
