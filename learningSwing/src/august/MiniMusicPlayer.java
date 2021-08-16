package august;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer {
    static JFrame frame = new JFrame("My first music video");
    static MyDrawPanel drawPanel;

    public static void main(String[] args) {
        MiniMusicPlayer miniMusicPlayer = new MiniMusicPlayer();
        miniMusicPlayer.go();
    }

    public void setUpGui() {
        drawPanel = new MyDrawPanel();
        frame.setContentPane(drawPanel);
        frame.setBounds(30, 30, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void go() {
        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            int r = 0;
            for (int i = 5; i < 64; i += 4) {
                r = (int) ((Math.random() * 50) + 1);
                track.add(makeEvent(144, 1, r, 100, i));

                track.add(makeEvent(176, 1, 127, 0, i));
                // Inserting own ControllerEvent (176 says the event type is ControllerEvent), looking out for event
                // 127. This does nothing but is needed so we can get an event. Same tick as event NOTE ON which is
                // what we needed.

                track.add(makeEvent(128, 1, r, 100, i + 2));
            }

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MidiEvent makeEvent(int comd, int channel, int one, int two, int tick) {
        MidiEvent midiEvent = null;

        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, channel, one, two);
            midiEvent = new MidiEvent(a, tick);
        } catch (Exception e) { }

        return midiEvent;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener {
        boolean msg = false;

        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics graphics) {
            if (msg) {
                Graphics2D graphics2D = (Graphics2D) graphics;

                int r = (int) (Math.random() * 250);
                int g = (int) (Math.random() * 250);
                int b = (int) (Math.random() * 250);

                graphics.setColor(new Color(r, g, b));

                int height = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);
                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                graphics.fillRect(x, y, width, height);
                msg = false;
            }
        }
    }
}
