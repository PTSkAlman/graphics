import javax.swing.*;
import java.awt.*;

public class Graphics extends Canvas {
    public Graphics() {
        JFrame frame = new JFrame();
        this.setSize(600,400);
        frame.add(this);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(java.awt.Graphics g) {
        drawTree(g, 100, 200);
        drawHouse(g, 200, 200);
        drawHouse(g, 250, 200);
        drawHouse(g, 300, 200);
    }

    private void drawHouse(java.awt.Graphics g, int posX, int posY) {
        g.setColor(Color.BLACK);
        int[] x = {0+posX, 25+posX, 50+posX};
        int[] y = {30+posY, 0+posY, 30+posY};
        g.fillPolygon(x,y,3);
        g.setColor(Color.RED);
        g.fillRect(0+posX, 30+posY,50,40);
    }

    private void drawTree(java.awt.Graphics g, int posX, int posY) {
        g.setColor(new Color(0,128,0));
        int[] x = {0+posX, 10+posX, 20+posX};
        int[] y = {30+posY, 0+posY, 30+posY};
        g.fillPolygon(x,y,3);
        g.setColor(new Color(156, 96, 0));
        g.fillRect(7+posX,30+posY,6,10);

    }

    public static void main(String[] args) {
        Graphics paint = new Graphics();
    }
}
