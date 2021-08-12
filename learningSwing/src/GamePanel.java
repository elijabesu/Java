import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private String endText = "GAME OVER";
    private Image obrazek;
    private int obrazekSirka;
    private int obrazekVyska;

    public GamePanel() {
        this.setBackground(Color.PINK);

//        // font nainstalovany v pocitaci
//        this.setFont(new Font("Quicksand", Font.BOLD, 20)); // Font.BOLD, Font.PLAIN a Font.ITALIC

        ImageIcon ii = new ImageIcon(this.getClass().getResource("resources/caf3dd.png"));
        // vrátí URL adresu souboru, který se nachází ve stejném umístění jako třída, kde byl tento kus kódu spuštěn
        obrazek = ii.getImage();

        obrazekSirka = obrazek.getWidth(this);
        obrazekVyska = obrazek.getHeight(this);

        int x = obrazekSirka + 50;
        int y = obrazekVyska + 50;
        Dimension rozmerPanelu = new Dimension(x, y);

        // velikost panelu
//        this.setPreferredSize(new Dimension(400, 300));
        this.setPreferredSize(rozmerPanelu);
    }

    // Komponenty, na které je možno malovat, poskytují metodu paintComponent(), krerá je volána při vykreslení
    // komponenty a ve které můžeme nadefinovat, co se má na komponentu kreslit.
    public void paintComponent(Graphics g) {
        // vykresleni pozadi
        super.paintComponent(g);

//        ZAKLADY
//        // text
//        g.drawString("Test", 50, 40);
//        g.setColor(Color.WHITE);
//        g.drawString("White test", 200, 40);
//
//        // lines
//        g.drawLine(30, 30, 200, 90);
//        g.setColor(Color.BLUE);
//        g.drawLine(10, 250, 360, 40);
//
//        // shapes
//        g.drawRect(300, 20, 65, 35);
//
//        g.setColor(Color.DARK_GRAY);
//        g.fillRect(200, 150, 50, 30);
//        g.drawRect(200, 150, 50, 30);
//
//        g.fillOval(320, 260, 70, 30);
//        g.setColor(Color.CYAN);
//        g.drawOval(320, 260, 70, 30);

        // OBRAZEK
        g.drawImage(obrazek, 25, 10, this);

        Font pismo = new Font("Quicksand", Font.BOLD, 28);
        // Font.MONOSPACED, Font.SERIF, Font.SANS_SERIF
        // Jsou to konstanty třídy Font. Monospaced je neproporcionální písmo, serif je patkové písmo (má kolmé čárky
        // na konci znaků) a sansserif je písmo bezpatkové (nemá kolmé čárky na konci znaků).
        g.setFont(pismo);
        g.setColor(Color.WHITE);

        // ziskani velikosti panelu
        int sirkaPanelu = this.getWidth();
        int vyskaPanelu = this.getHeight();

        // ziskani velikosti textu
        FontMetrics fm = g.getFontMetrics(pismo);
        // Pomocí tohoto objektu můžeme zjisti řadu informací o daném písmu jako například sklon či šířku jednotlivých
        // znaků, šířku a výšku určitého textu nebo získat obrysový obdélník (obdélník o výšce a šířce textu).
        int sirkaTextu = fm.stringWidth(endText);

        // vykresleni textu
        g.drawString(endText, ((sirkaPanelu - sirkaTextu)/2), (vyskaPanelu - 5));
    }
}
