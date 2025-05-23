
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class Mein {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1920,1080);
        frame.setVisible(true);

        JPanel redPanel=new JPanel();
        redPanel.setBackground(ColorUIResource.RED);
        redPanel.setBounds(250,0,250,250);
    }

}
