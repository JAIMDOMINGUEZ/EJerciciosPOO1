import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JMenBar   {
    JFrame f;
    JMenuBar mb;
    JMenu  m1,  m2,  m3;
    JMenuItem mi1,mi2;
    public JMenBar  () {
        f = new JFrame("MenuBar");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("Help");
        mi1 = new JMenuItem("New");
        mi2 = new JMenuItem("Exit");
        m3.add(mi1);
        m3.add(mi2);
        m3.addSeparator();
        mi1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f,"Hola estoy en new","Mensaje",
                JOptionPane.INFORMATION_MESSAGE,new ImageIcon("new.png"));
               
            }
            });
        
        mi2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.dispose();
            }
            });  
  
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        f.setSize(500, 500);
        f.setJMenuBar(mb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public void launchFrame() {
        f.setVisible(true);
    }
    public static void main(String args[]) {
        JMenBar guiApp = new JMenBar();
         guiApp.launchFrame();
    }

    
    
}

    
        