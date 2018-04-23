import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        int starNumber = 100;
        stars(graphics, starNumber);
    }

    private static void stars(Graphics graphics, int starNumber){
        int starSide = 5;

        for (int i = 0; i < starNumber; i++) {
            int x = randomWithMax(WIDTH) - starSide;
            int y = randomWithMax(HEIGHT) - starSide;
            int rgb = randomWithMax(255);
            Color grey = new Color(rgb, rgb, rgb);
            graphics.setColor(grey);
            graphics.fillRect(x, y, starSide, starSide);
        }
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
