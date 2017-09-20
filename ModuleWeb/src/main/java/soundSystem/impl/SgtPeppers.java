package soundSystem.impl;

import org.springframework.stereotype.Component;
import soundSystem.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "SgtPeppers title";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
