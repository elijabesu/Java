package august;

import javax.sound.midi.*;

public class MiniMusicPlayer implements ControllerEventListener {

    public static void main(String[] args) {
        MiniMusicPlayer miniMusicPlayer = new MiniMusicPlayer();
        miniMusicPlayer.go();
    }

    public void go() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant = {127}; // want even #127
            sequencer.addControllerEventListener(this, eventsIWant);

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            for (int i = 5; i < 64; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));

                track.add(makeEvent(176, 1, 127, 0, i));
                // Inserting own ControllerEvent (176 says the event type is ControllerEvent), looking out for event
                // 127. This does nothing but is needed so we can get an event. Same tick as event NOTE ON which is
                // what we needed.

                track.add(makeEvent(128, 1, i, 100, i + 2));
            }

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void controlChange(ShortMessage event) {
        System.out.println("la");
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
