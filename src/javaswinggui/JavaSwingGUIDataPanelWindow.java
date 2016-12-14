
package javaswinggui;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class JavaSwingGUIDataPanelWindow extends JFrame {
    
    private JavaSwingGUIDataPanel dataPanel = new JavaSwingGUIDataPanel();

    public JavaSwingGUIDataPanelWindow() {
        dataPanel.setDlText("Hello World");
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras massa est, convallis quis posuere ut, eleifend et dui. Suspendisse iaculis porttitor aliquet. Maecenas ultricies lacus eget tempus volutpat. Morbi eu metus sed sem porttitor ultrices non eu magna. Nunc pulvinar vitae tortor nec tincidunt. Aenean vitae diam elit. Donec a augue non neque fermentum tincidunt. Phasellus nec vulputate nulla. Quisque eget consequat metus. Vestibulum pretium est ipsum, quis pharetra sem congue id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vivamus rutrum velit quis velit volutpat viverra. Proin facilisis cursus nibh gravida aliquet. Curabitur tempor nec est a semper.\n" +
"\n" +
"Suspendisse a velit at neque condimentum porta. Praesent sollicitudin leo elit, vitae faucibus justo ullamcorper et. Curabitur at nunc eu nibh posuere luctus. Nunc in vulputate leo. Maecenas non eros tellus. Donec vitae mattis risus, quis tempor eros. Vivamus sit amet enim vitae dolor iaculis vehicula eget sit amet sem. Nam nec pellentesque enim, in semper odio. Cras facilisis eu nunc sit amet cursus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis porttitor orci non ex faucibus, ut sodales odio tincidunt. Suspendisse faucibus, nisi ut finibus commodo, ligula elit molestie eros, ut mollis leo enim a sem. Nunc nec diam nec sapien egestas faucibus id vel nibh. Pellentesque sagittis lectus eu tortor sollicitudin, viverra pharetra nulla tristique. Fusce pulvinar vitae turpis vel ultricies. Suspendisse orci leo, consequat ut neque nec, sodales ultricies ex.\n" +
"\n" +
"Phasellus turpis libero, ullamcorper in dapibus nec, porta et sem. Nunc et ante ac mauris laoreet sagittis at id quam. Donec dignissim ac mi vitae feugiat. Nunc rutrum eros viverra, elementum nunc nec, ornare libero. Praesent ullamcorper consequat quam in dapibus. Mauris a pharetra sapien. Maecenas non diam a velit aliquam vulputate. In sit amet massa lacus. ";
        dataPanel.setTaText(text);
        setLayout(new BorderLayout());
        add(dataPanel,BorderLayout.CENTER);
    }
    
}
