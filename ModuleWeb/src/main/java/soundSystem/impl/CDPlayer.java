package soundSystem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import soundSystem.CompactDisc;
import soundSystem.MediaPlayer;

public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
