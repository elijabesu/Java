package august;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Components {

    public static void main(String[] args) {
        TextArea gui = new TextArea();
        gui.go();
    }

    public static class TextArea implements ActionListener {
        JTextArea textArea;

        private void go() {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JButton button = new JButton("click me");
            button.addActionListener(this);
            textArea = new JTextArea(10, 20);
            textArea.setLineWrap(true);

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            panel.add(scrollPane);

            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.getContentPane().add(button, BorderLayout.SOUTH);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(350, 300);
            frame.pack();
            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.append("clicked\n");
        }
    }
}
