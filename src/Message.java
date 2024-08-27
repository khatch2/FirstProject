import javax.swing.*;
import java.awt.*;

public class Message extends JFrame {
    private String message;
    private int x;
    private int y;

    public Message(String message, int x, int y) {
        this.message = message;
        this.x = x;
        this.y = y;
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(message, x, y);
    }
}

