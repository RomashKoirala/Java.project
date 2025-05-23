import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class CatchTheCoinGame extends JPanel implements KeyListener {
    private int playerX = 100, playerY = 100; 
    private int coinX, coinY; 
    private int score = 0;
    private final int SIZE = 30; 
    private Random random = new Random();

    public CatchTheCoinGame() {
        setPreferredSize(new Dimension(400, 400));
        setFocusable(true);
        addKeyListener(this);
        spawnCoin(); 
    }

    private void spawnCoin() {
        coinX = random.nextInt(370);
        coinY = random.nextInt(370);
    }

    private void checkCollision() {
        if (Math.abs(playerX - coinX) < SIZE && Math.abs(playerY - coinY) < SIZE) {
            score++;
            spawnCoin();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(playerX, playerY, SIZE, SIZE);
        g.setColor(Color.YELLOW);
        g.fillOval(coinX, coinY, SIZE, SIZE);
        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 10, 20);
    }
    public void move(int dx, int dy) {
        playerX += dx;
        playerY += dy;
        checkCollision();
        repaint();
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
        JFrame frame = new JFrame("Catch the Coin");
        CatchTheCoinGame game = new CatchTheCoinGame();
        
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

