import java.awt.*;
public class Doodle {
    public static void main(String[] args) {
        DrawingPanel circles = new DrawingPanel (100, 100);
        Graphics g = circles.getGraphics();
        circles.setBackground(Color.RED);
    }
    public static void circle (Graphics g, int x, int y, int size) {
        g.setColor(Color. WHITE);
        for (int i = 1; i <= 4; i++) {
            g.drawOval (x + 20 * i, y + 20 * i, 25* i, 25 * i);
        }
    }
}
    