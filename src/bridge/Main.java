package bridge;

import bridge.platforms.Facebook;
import bridge.platforms.IPlatform;
import bridge.platforms.TwitchTV;
import bridge.platforms.YouTube;
import bridge.transmissions.AdvancedLive;
import bridge.transmissions.Live;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
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
