package bridge;

import bridge.platforms.*;
import bridge.transmissions.AdvancedLive;
import bridge.transmissions.Live;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform) {
       /* System.out.println("Aguarde....");
        Live live = new Live(platform);
        live.broadcasting();
        live.results();*/

        System.out.println("Transmissão avançada.. aguarde!");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.results();
    }
}
