package august;

import javax.swing.*;
import java.awt.*;

public class Layouts {

    public static void main(String[] args) {
        Layouts gui = new Layouts();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame(); // JFrame's default is BorderLayout
        JButton button = new JButton("click me");
//        JButton button = new JButton("click me like you mean it");
        Font bigFont = new Font("QuickSand", Font.BOLD, 28);
        button.setFont(bigFont);
        // buttons get as wide as they want to be when placed EAST or WEST
        // buttons get as tall as they want to be when placed NORTH or SOUTH
        // components in the CENTER get whatever space is left
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
