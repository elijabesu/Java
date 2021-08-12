package august;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {

    JFrame frame;
    JLabel label;
    JLabel colourLabel;

    public static void main (String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change the label");
        labelButton.addActionListener(new LabelListener());

        JButton colourButton = new JButton("Change the colour");
        colourButton.addActionListener(new ColourListener());

        label = new JLabel("I'm a label");
        label.setHorizontalAlignment(JLabel.CENTER);
        colourLabel = new JLabel();
        colourLabel.setHorizontalAlignment(JLabel.CENTER);
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.WEST, colourButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.SOUTH, label);
        frame.getContentPane().add(BorderLayout.NORTH, colourLabel);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {
        int x = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            x++;
            label.setText("I've been inappropriately touched " + x + " times.");
        }
    }

    class ColourListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    public class MyDrawPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;

            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            Color startColour = new Color(red, green, blue);

            red = (int) (Math.random() * 256);
            green = (int) (Math.random() * 256);
            blue = (int) (Math.random() * 256);
            Color endColour = new Color(red, green, blue);

            GradientPaint gradient = new GradientPaint(70, 70, startColour, 150, 150, endColour);
            g2d.setPaint(gradient);
            g.fillOval(70, 70, 100, 100);
            colourLabel.setText("Current gradient: " + String.format("#%02x%02x%02x",
                    startColour.getRed(),
                    startColour.getGreen(),
                    startColour.getBlue()) + " -> " + String.format("#%02x%02x%02x",
                    endColour.getRed(),
                    endColour.getGreen(),
                    endColour.getBlue()));
        }
    }
}
