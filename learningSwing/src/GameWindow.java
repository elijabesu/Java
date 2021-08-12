import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;

public class GameWindow extends JFrame {
    private JLabel statusBar;

    public GameWindow() {
        this.setTitle("Learning Swing :D");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // zavrit program po kliknuti na X

        createMenuBar();

        statusBar = new JLabel("Easy");
        statusBar.setBorder(BorderFactory.createEtchedBorder());
        this.add(statusBar, BorderLayout.SOUTH);

//        GamePanel panel = new GamePanel();
        PanelUdalosti panel = new PanelUdalosti();
        this.add(panel);

//        this.setResizable(false); // pevna velikost
        this.pack(); // zabali okno panelu
    }

    public static void main(String[] args) {
//        GameWindow window = new GameWindow();
//        window.setVisible(true);
        new GameWindow().setVisible(true);
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        menuBar.add(createFileMenu());
        menuBar.add(createViewMenu());
        menuBar.add(createDifficultyMenu());
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(createHelpMenu());

        setJMenuBar(menuBar);
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem exit = new JMenuItem("Exit");
        exit.setToolTipText("Exit application");
        exit.addActionListener((event) -> System.exit(0));

        JMenuItem newMenu = new JMenuItem("New");
        JMenuItem load = new JMenuItem("Load");
        JMenuItem save = new JMenuItem("Save");

        exit.setMnemonic(KeyEvent.VK_E);
        newMenu.setMnemonic(KeyEvent.VK_N);
        load.setMnemonic(KeyEvent.VK_L);
        save.setMnemonic(KeyEvent.VK_S);

        fileMenu.add(newMenu);
        fileMenu.add(load);
        fileMenu.add(save);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        return fileMenu;
    }

    private JMenu createViewMenu() {
        JMenu viewMenu = new JMenu("View");
        viewMenu.setMnemonic(KeyEvent.VK_V);
        JCheckBoxMenuItem showStatusBar = new JCheckBoxMenuItem("Show statusbar");
        showStatusBar.setMnemonic(KeyEvent.VK_S);
        showStatusBar.setDisplayedMnemonicIndex(5);
        showStatusBar.setSelected(true);

        showStatusBar.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) statusBar.setVisible(true);
            else statusBar.setVisible(false);
        });

        viewMenu.add(showStatusBar);

        return viewMenu;
    }

    private JMenu createDifficultyMenu() {
        JMenu difMenu = new JMenu("Difficulty");
        difMenu.setMnemonic(KeyEvent.VK_D);
        ButtonGroup difGroup = new ButtonGroup();

        JRadioButtonMenuItem easy = new JRadioButtonMenuItem("Easy");
        easy.setSelected(true);
        easy.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) { statusBar.setText("Easy");}
        });

        JRadioButtonMenuItem medium = new JRadioButtonMenuItem("Medium");
        medium.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) { statusBar.setText("Medium");}
        });

        JRadioButtonMenuItem hard = new JRadioButtonMenuItem("Hard");
        hard.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) { statusBar.setText("Hard");}
        });

        difMenu.add(easy);
        difMenu.add(medium);
        difMenu.add(hard);

        difGroup.add(easy);
        difGroup.add(medium);
        difGroup.add(hard);

        return difMenu;
    }

    private JMenu createHelpMenu() {
        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);
        return helpMenu;
    }
}
