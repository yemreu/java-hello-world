
package javaswinggui;

import javax.swing.JButton;
import javax.swing.JFrame;


public class JavaSwingGUI {


    public static void main(String[] args) {
        JFrame window = new JFrame("Penceremiz");
        window.setSize(400,400);
        window.setLocation(0, 0);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        JButton button = new JButton("Butonumuz");
        window.add(button);

        JavaSwingGUIFlowLayout windowFlowLayout = new JavaSwingGUIFlowLayout();
        windowFlowLayout.setSize(400,200);
        windowFlowLayout.setTitle("FlowLayout");
        windowFlowLayout.setLocation(400, 0);
        windowFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFlowLayout.setVisible(true);
        
        JavaSwingGUIGridLayout windowGridLayout = new JavaSwingGUIGridLayout();
        windowGridLayout.setSize(400,200);
        windowGridLayout.setTitle("GridLayout");
        windowGridLayout.setLocation(800,0);
        windowGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowGridLayout.setVisible(true);
        
        JavaSwingGUIBorderLayout windowBorderLayout = new JavaSwingGUIBorderLayout();
        windowBorderLayout.setSize(400,300);
        windowBorderLayout.setTitle("BorderLayout");
        windowBorderLayout.setLocation(1200,0);
        windowBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowBorderLayout.setVisible(true);
        
        JavaSwingGUIKarma windowKarma = new JavaSwingGUIKarma();
        windowKarma.setSize(400,300);
        windowKarma.setTitle("Karma");
        windowKarma.setLocation(0, 400);
        windowKarma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowKarma.setVisible(true);
        
        JavaSwingGUIRenklendirme renklendirme = new JavaSwingGUIRenklendirme();
        renklendirme.setSize(400,300);
        renklendirme.setTitle("Renklendirme");
        renklendirme.setLocation(0, 700);
        renklendirme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        renklendirme.setVisible(true);
        
        JavaSwingGUIFontBelirleme fontBelirleme = new JavaSwingGUIFontBelirleme();
        fontBelirleme.setSize(400,300);
        fontBelirleme.setTitle("Font Belirleme");
        fontBelirleme.setLocation(400, 200);
        fontBelirleme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fontBelirleme.setVisible(true);
        
        JavaSwingGUIPaneller panel = new JavaSwingGUIPaneller();
        panel.setSize(400,300);
        panel.setTitle("Paneller");
        panel.setLocation(400, 500);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);
        
        JavaSwingGUIIkonlar ikonlar = new JavaSwingGUIIkonlar();
        ikonlar.setSize(400,300);
        ikonlar.setTitle("İkonlar");
        ikonlar.setLocation(800, 200);
        ikonlar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ikonlar.setVisible(true);
        
        JavaSwingGUIGrafiklerWindow grafikWindow = new JavaSwingGUIGrafiklerWindow();
        grafikWindow.setSize(400,300);
        grafikWindow.setTitle("İkonlar");
        grafikWindow.setLocation(800, 500);
        grafikWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grafikWindow.setVisible(true);
        
        JavaSwingGUIPanelGrafikWindow panelGrafikWindow = new JavaSwingGUIPanelGrafikWindow();
        panelGrafikWindow.setSize(400,300);
        panelGrafikWindow.setTitle("Panel Grafik");
        panelGrafikWindow.setLocation(1200, 300);
        panelGrafikWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelGrafikWindow.setVisible(true);
        
        JavaSwingGUIPolygonWindow polygonWindow = new JavaSwingGUIPolygonWindow();
        polygonWindow.setSize(400,300);
        polygonWindow.setTitle("Polygon polyline");
        polygonWindow.setLocation(1200, 600);
        polygonWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        polygonWindow.setVisible(true);
        
        JavaSwingGUIPanelSekillerWindow panelSekilWindow = new JavaSwingGUIPanelSekillerWindow();
        panelSekilWindow.setSize(400,300);
        panelSekilWindow.setTitle("PanelSekiller");
        panelSekilWindow.setLocation(1200, 900);
        panelSekilWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelSekilWindow.setVisible(true);
        
        JavaSwingGUIEvent event = new JavaSwingGUIEvent();
        event.setSize(400,300);
        event.setTitle("Events");
        event.setLocationRelativeTo(null);
        event.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        event.setVisible(true);
        
        JavaSwingGUIActionEventWindow actionEvent = new JavaSwingGUIActionEventWindow();
        actionEvent.setSize(400,300);
        actionEvent.setTitle("ActionEvents");
        actionEvent.setLocationRelativeTo(null);
        actionEvent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        actionEvent.setVisible(true);
        
        JavaSwingGUIWindowEventWindow windowEvent = new JavaSwingGUIWindowEventWindow();
        windowEvent.setSize(400,300);
        windowEvent.setTitle("WindowEvents");
        windowEvent.setLocationRelativeTo(null);
        windowEvent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowEvent.setVisible(true);
        
        JavaSwingGUIWindowEventWindow2 windowEvent2 = new JavaSwingGUIWindowEventWindow2();
        windowEvent2.setSize(400,300);
        windowEvent2.setTitle("WindowEvents2");
        windowEvent2.setLocationRelativeTo(null);
        windowEvent2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowEvent2.setVisible(true);
        
        JavaSwingGUIMousePanelWindow mousePanel = new JavaSwingGUIMousePanelWindow();
        mousePanel.setSize(400,300);
        mousePanel.setTitle("MouseEvent");
        mousePanel.setLocationRelativeTo(null);
        mousePanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mousePanel.setVisible(true);
        
        JavaSwingGUIKeyboardPanelWindow keyboardPanel = new JavaSwingGUIKeyboardPanelWindow();
        keyboardPanel.setSize(400,300);
        keyboardPanel.setTitle("KeyboardEvent");
        keyboardPanel.setLocationRelativeTo(null);
        keyboardPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyboardPanel.setVisible(true);
        
        JavaSwingGUIDrawingPanelWindow drawingPanel = new JavaSwingGUIDrawingPanelWindow();
        drawingPanel.setSize(600,450);
        drawingPanel.setTitle("drawingPanel");
        drawingPanel.setLocationRelativeTo(null);
        drawingPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawingPanel.setVisible(true);
        
        JavaSwingGUITextFieldWindow textFieldPanel = new JavaSwingGUITextFieldWindow();
        textFieldPanel.setSize(600,450);
        textFieldPanel.setTitle("TextField Panel");
        textFieldPanel.setLocationRelativeTo(null);
        textFieldPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldPanel.setVisible(true);
        
        JavaSwingGUIDataPanelWindow dataPanel = new JavaSwingGUIDataPanelWindow();
        dataPanel.setSize(600,300);
        dataPanel.setTitle("TextArea Panel");
        dataPanel.setLocationRelativeTo(null);
        dataPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dataPanel.setVisible(true);
        
        JavaSwingGUITextSelectWindow textSelect = new JavaSwingGUITextSelectWindow();
        textSelect.setSize(600,300);
        textSelect.setTitle("textSelect");
        textSelect.setLocationRelativeTo(null);
        textSelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textSelect.setVisible(true);
        
        JavaSwingGUIListeEkleme listeEkle = new JavaSwingGUIListeEkleme();
        listeEkle.setSize(400,400);
        listeEkle.setTitle("listeEkle");
        listeEkle.setLocationRelativeTo(null);
        listeEkle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listeEkle.setVisible(true);
        
        JavaSwingGUICardLayout cardLayout = new JavaSwingGUICardLayout();
        cardLayout.setSize(400,300);
        cardLayout.setTitle("cardLayout");
        cardLayout.setLocationRelativeTo(null);
        cardLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cardLayout.setVisible(true);
    }
    
}
