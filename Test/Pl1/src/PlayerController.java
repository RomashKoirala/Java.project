import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class PlayerController implements KeyListener {
    private int x, y; // Player position

    public PlayerController() {
        x = 100; // Initial position
        y = 100;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("Player moved to: (" + x + ", " + y + ")");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP -> move(0, -10);
            case KeyEvent.VK_DOWN -> move(0, 10);
            case KeyEvent.VK_LEFT -> move(-10, 0);
            case KeyEvent.VK_RIGHT -> move(10, 0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Player Controller");
        PlayerController player = new PlayerController();
        
        frame.addKeyListener(player);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
