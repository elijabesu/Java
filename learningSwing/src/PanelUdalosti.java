import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PanelUdalosti extends JPanel {
    private JButton tlacitko;
    private JLabel navesti;

    public PanelUdalosti() {
        this.setPreferredSize(new Dimension(300, 40));

        tlacitko = new JButton("Tlacitko");
        this.add(tlacitko);

        PosluchacTlacitka posluchacTlacitka = new PosluchacTlacitka();
        tlacitko.addActionListener(posluchacTlacitka);

//        PosluchacPanelu posluchacPanelu = new PosluchacPanelu();
//        this.addKeyListener(posluchacPanelu);

        navesti = new JLabel("Tady je navesti");
        this.add(navesti);

        // Aby komponenta mohla generovat události KeyEvent, musí mít zaměření (focus).
        this.setFocusable(true);
    }

    // Vytvoříme třídu posluchače pro tlačítko (zde ho vytváříme jako třídu ve třídě). Můžeme ho ale klidně vytvořit
    // jako samostatnou třídu v samostatném souboru.
    private class PosluchacTlacitka implements ActionListener {
        // Aby na ně mohl posluchač reagovat, musí implementovat rozhraní ActionListener. Toto rozhraní má jedinou
        // metodu actionPerformed(ActionEvent e), do které se naprogramuje to, co má posluchač po obdržení zprávy
        // (události) dělat
        @Override
        public void actionPerformed(ActionEvent e) {
            navesti.setText("Stisknuli jste tlacitko.");
        }
    }

    private class PosluchacPanelu implements KeyListener {
        @Override
        public void keyPressed(KeyEvent e) {
            navesti.setText("Stiskli jste klavesu: " + e.getKeyChar());
        }

        @Override
        public void keyReleased(KeyEvent e) {
            navesti.setText("Pustili jste klavesu: " + e.getKeyCode());
        }

        @Override
        public void keyTyped(KeyEvent e) {
            // is only generated if a valid Unicode character could be generated.
        }
    }
}
