import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutExample {
    private JFrame f;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5 ,bxtra;
    private JPanel panel ;

    public BoxLayoutExample() {
    f = new JFrame("Box Layout");
    b1 = new JButton("Button 1");
    b2 = new JButton("Button 2");
    b3 = new JButton("Button 3");
    b4 = new JButton("Button 4");
    b5 = new JButton("Button 5");
    bxtra = new JButton("Button Extra");
    JPanel panel = new JPanel();
    }
  
    public void launchFrame() {
        
        BoxLayout caja = new BoxLayout(panel, BoxLayout.Y_AXIS);
        bxtra.setBackground(new java.awt.Color(121,90,149));
        panel.setLayout(caja);
        panel.add(bxtra);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        f.add(panel);
       
        
   
        f.setVisible(true);
    }
    
    
    public static void main(String args[]) {
    BoxLayoutExample guiWindow = new BoxLayoutExample();
    guiWindow.launchFrame();
    }
    
} // end of LayoutExample class
