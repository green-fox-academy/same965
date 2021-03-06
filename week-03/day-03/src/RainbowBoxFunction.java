import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int squareNumber = 100;
        int rgb = 255;

        for (int i = 0; i < squareNumber; i++) {
            int squareSize = randomWithMax(WIDTH);
            Color color = new Color(randomWithMax(rgb), randomWithMax(rgb), randomWithMax(rgb));
            rainbowSqure(graphics, squareSize, color);
        }
    }

    private static void rainbowSqure(Graphics graphics, int squareSize, Color color) {
        graphics.setColor(color);
        graphics.drawRect(WIDTH / 2 - squareSize / 2, HEIGHT / 2 - squareSize / 2, squareSize, squareSize);
    }

    private static int randomWithMax(int max) {
        return (int)(Math.random() * max);
    }

    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
