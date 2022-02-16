import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Canvas {

    public static void main(String[] args) {
        // test the Canvas class
        Canvas canvas = new Canvas(500, 500); // creates canvas window
        canvas.fillRect(50, 50, 200, 200, Color.BLUE); // draws a rect
        canvas.clear(); // removes all drawings from canvas window
        canvas.fillRect(50, 100, 300, 200, Color.RED);
        canvas.fillRect(100,150,300,300, Color.CYAN);

        // everything here will be executed
    }

    private JFrame frame = new JFrame();
    private List<Consumer<Graphics>> drawTasks = new ArrayList<>();

    public Canvas(int width, int height) {
        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                for (Consumer<Graphics> drawTask : drawTasks) {
                    drawTask.accept(g);
                }
            }
        };
        panel.setPreferredSize(new Dimension(width, height));
        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void fillRect(int x, int y, int width, int height, Color color){
        drawTasks.add(graphics -> {
            graphics.setColor(color);
            graphics.fillRect(x, y, width, height);
        });
        frame.repaint();
    }

    public void clear() {
        drawTasks.clear();
        frame.repaint();
    }
}