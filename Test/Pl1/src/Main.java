
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

 
public class Main
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setTitle("hello");
        frame.setSize(430,420);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon Image =new ImageIcon("image.png");
        frame.setIconImage(Image.getImage());
        frame.getContentPane().setBackground(new Color(123,50,250));   
    }
}
