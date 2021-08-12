package august;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    // starting points
    int x = 50;
    int y = 50;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            if (i > 50) x--; else x+=2;
            if (i > 90) y-=2; else y++;

            drawPanel.repaint();

            try {
                Thread.sleep(50);
            } catch (Exception e) { }
        }
    }

    class MyDrawPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.PINK);
            g.fillOval(x, y, 40, 40);
        }
    }
}
