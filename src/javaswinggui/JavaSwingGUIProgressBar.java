
package javaswinggui;

import com.sun.javafx.scene.control.skin.ProgressBarSkin;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

public class JavaSwingGUIProgressBar extends JPanel implements ActionListener, PropertyChangeListener {
    
    private JProgressBar progressBar;
    private JButton btnBaslat;
    private JTextArea gorevZamani;
    private Gorev gorev;
    
    class Gorev extends SwingWorker<Void,Void>{

        @Override
        protected Void doInBackground() throws Exception {
            Random random = new Random();
            int progress = 0;
            
            setProgress(0);
            while(progress<100){
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                }
                progress+=random.nextInt(10);
                setProgress(Math.min(progress,100));
            }
            return null;
        }

        @Override
        protected void done() {
            Toolkit.getDefaultToolkit().beep();
            btnBaslat.setEnabled(true);
            setCursor(null);
            gorevZamani.append("Bitti..\n");
        }
    }
    
    public JavaSwingGUIProgressBar() {
        super(new BorderLayout());
        btnBaslat = new JButton("Start");
        btnBaslat.setActionCommand("start");
        btnBaslat.addActionListener(this);
        
        progressBar = new JProgressBar(0,100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        gorevZamani = new JTextArea(5,20);
        gorevZamani.setMargin(new Insets(5,5,5,5));
        gorevZamani.setEditable(false);
        
        JPanel panel = new JPanel();
        panel.add(btnBaslat);
        panel.add(progressBar);
        add(panel,BorderLayout.PAGE_START);
        add(new JScrollPane(gorevZamani),BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        btnBaslat.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        gorev = new Gorev();
        gorev.addPropertyChangeListener(this);
        gorev.execute();
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
        if("progress".equals(e.getPropertyName())){
            int progress = (Integer) e.getNewValue();
            progressBar.setValue(progress);
            gorevZamani.append(String.format("Tamamlanan görev... %d%% \n",gorev.getProgress()));
        }
    }
    
    public static void window(){
        JFrame frame = new JFrame("progress bar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent contentPane = new JavaSwingGUIProgressBar();
        contentPane.setOpaque(true);
        frame.setContentPane(contentPane);
        frame.pack();
        frame.setVisible(true);
    }
}
