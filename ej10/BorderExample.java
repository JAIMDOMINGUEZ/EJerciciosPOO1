import java.awt.BorderLayout;
import javax.swing.*;

public class BorderExample { private JFrame f;
private JButton bn, bs, bw, be, bc,bxtra;

public BorderExample() {
    f = new JFrame("Border Layout");
    bn = new JButton("Button 1");
    bc = new JButton("Button 2");
    bw = new JButton("Button 3");
    bs = new JButton("Button 4");
    be = new JButton("Button 5");
    bxtra = new JButton("Button Extra");
 }
 public void launchFrame() {
    bxtra.setBackground(new java.awt.Color(121,90,149));
    f.add(bxtra, BorderLayout.PAGE_END);
    f.add(bn, BorderLayout.NORTH);
    f.add(bs, BorderLayout.SOUTH);
    f.add(bw, BorderLayout.WEST);
    f.add(be, BorderLayout.EAST);
    f.add(bc, BorderLayout.CENTER);
    f.setSize(400,200);
    
    f.setVisible(true);
    }
    
    public static void main(String args[]) {
    BorderExample guiWindow2 = new BorderExample();
    guiWindow2.launchFrame();
    }
}
