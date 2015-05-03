package ohtu.kivipaperisaksetFIXED.GamePlayers;

import ohtu.kivipaperisaksetFIXED.GamePlayers.Player;

/**
 *
 * @author JjyKs
 */
public class PelaajaTehdas {

    public static Player getPlayer(String type) {
        if (type.toLowerCase().equals("a")) {
            return new Player();
        }
        if (type.toLowerCase().equals("b")) {
            return new PlayerAI();
        }
        if (type.toLowerCase().equals("c")) {
            return new PlayerAIAdvanced();
        }

        return null;
    }
}
