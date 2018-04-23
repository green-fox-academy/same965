import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] drawBox = {{10, 10}, {290, 10}, {290, 290}, {10, 290}, {10, 10}};
        drawFigure(graphics, drawBox);

        int[][] drawFox = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}, {50, 100}};
        drawFigure(graphics, drawFox);
    }

    private static void drawFigure(Graphics graphics, int[][] draw) {
        for (int i = 0; i < draw.length - 1; i++) {
            int[] beginLine = draw[i];
            int[] endLine = draw[i +1];
            int[] coordinates = {beginLine[0], beginLine[1], endLine[0], endLine[1]};
            drawGreenLines(graphics, coordinates);
      }
    }

    private static void drawGreenLines(Graphics graphics, int[] coordinates) {
        graphics.setColor(Color.GREEN);
        graphics.drawLine(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
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


// create a 300x300 canvas.
