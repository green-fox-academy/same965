import javax.swing.*;

import java.awt.*;

import static java.awt.Frame.MAXIMIZED_BOTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4; i++) {
            int x = randomWithMax(WIDTH);
            int y = randomWithMax(HEIGHT);
            int sideA = randomWithMax(WIDTH - x);
            int sideB = randomWithMax(HEIGHT - y);
            Color color = new Color(randomWithMax(255), randomWithMax(255), randomWithMax(255));
            graphics.setColor(color);
            graphics.drawRect(x, y, sideA, sideB);
        }
    }

    private static int randomWithMax(int max) {
        return (int)(Math.random() * max);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}