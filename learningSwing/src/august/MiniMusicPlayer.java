package august;

import javax.sound.midi.*;

public class MiniMusicPlayer {

    public static void main(String[] args) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            for (int i = 5; i < 64; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));
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
}
