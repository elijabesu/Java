import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DragDrop extends JFrame {
    public JLabel redLabel;
    public JLabel orangeLabel;
    public JLabel yellowLabel;
    public JLabel greenLabel;
    public JLabel blueLabel;
    public JLabel purpleLabel;

//    public JButton button;
    public JLabel label;

    public DragDrop() {
        ImageIcon red = new ImageIcon("src/resources/red.png");
        ImageIcon orange = new ImageIcon("src/resources/orange.png");
        ImageIcon yellow = new ImageIcon("src/resources/yellow.png");
        ImageIcon green = new ImageIcon("src/resources/green.png");
        ImageIcon blue = new ImageIcon("src/resources/blue.png");
        ImageIcon purple = new ImageIcon("src/resources/purple.png");

        redLabel = new JLabel(red, JLabel.CENTER);
        orangeLabel = new JLabel(orange, JLabel.CENTER);
        yellowLabel = new JLabel(yellow, JLabel.CENTER);
        greenLabel = new JLabel(green, JLabel.CENTER);
        blueLabel = new JLabel(blue, JLabel.CENTER);
        purpleLabel = new JLabel(purple, JLabel.CENTER);

        DragMouseAdapter listener = new DragMouseAdapter();
        redLabel.addMouseListener(listener);
        orangeLabel.addMouseListener(listener);
        yellowLabel.addMouseListener(listener);
        greenLabel.addMouseListener(listener);
        blueLabel.addMouseListener(listener);
        purpleLabel.addMouseListener(listener);

//        button = new JButton(green);
//        button.setFocusable(false);
        label = new JLabel(green, JLabel.CENTER);

        redLabel.setTransferHandler(new TransferHandler("icon"));
        orangeLabel.setTransferHandler(new TransferHandler("icon"));
        yellowLabel.setTransferHandler(new TransferHandler("icon"));
        greenLabel.setTransferHandler(new TransferHandler("icon"));
        blueLabel.setTransferHandler(new TransferHandler("icon"));
        purpleLabel.setTransferHandler(new TransferHandler("icon"));
//        button.setTransferHandler(new TransferHandler("icon"));
        label.setTransferHandler(new TransferHandler("icon"));

//        createLayout(redLabel, orangeLabel, yellowLabel, greenLabel, blueLabel, purpleLabel, button);
        createLayout(redLabel, orangeLabel, yellowLabel, greenLabel, blueLabel, purpleLabel, label);

        setTitle("Icon Drag & Drop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private class DragMouseAdapter extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            JComponent c = (JComponent) e.getSource();
            TransferHandler handler = c.getTransferHandler();
            handler.exportAsDrag(c, e, TransferHandler.COPY);
        }
    }

    private void createLayout(JComponent... arg) {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);

        gl.setHorizontalGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(gl.createSequentialGroup()
                        .addComponent(arg[0]).addGap(20)
                        .addComponent(arg[1]).addGap(20)
                        .addComponent(arg[2]).addGap(20)
                        .addComponent(arg[3]).addGap(20)
                        .addComponent(arg[4]).addGap(20)
                        .addComponent(arg[5]).addGap(20)
                ).addComponent(arg[6], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Integer.MAX_VALUE)
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup()
                        .addComponent(arg[0])
                        .addComponent(arg[1])
                        .addComponent(arg[2])
                        .addComponent(arg[3])
                        .addComponent(arg[4])
                        .addComponent(arg[5]))
                .addGap(20)
                .addComponent(arg[6])
        );

        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new DragDrop();
            ex.setVisible(true);
        });
    }
}
