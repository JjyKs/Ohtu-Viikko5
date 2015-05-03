package ohtu.kivipaperisaksetFIXED;

import ohtu.kivipaperisaksetFIXED.GamePlayers.PelaajaTehdas;
import ohtu.kivipaperisaksetFIXED.GamePlayers.Player;

/**
 *
 * @author JjyKs
 */
public class PeliHandler {

    public boolean pelaa(String vastaus) {
        Tuomari tuomari = new Tuomari();
        Player pelaaja = PelaajaTehdas.getPlayer("a");
        Player pelaaja2 = PelaajaTehdas.getPlayer(vastaus);

        if (pelaaja2 == null) {
            return false;
        } else {

            while (true) {
                String siirto1 = pelaaja.annaSiirto();
                if (!jatketaanCheck(siirto1, tuomari)) {
                    break;
                }

                String siirto2 = pelaaja2.annaSiirto();
                if (!jatketaanCheck(siirto2, tuomari)) {
                    break;
                }

                pelaaja.asetaSiirto(siirto2);
                pelaaja2.asetaSiirto(siirto1);
                tuomari.kirjaaSiirto(siirto1, siirto2);

                System.out.println(tuomari);
            }
            return true;
        }
    }

    public static boolean jatketaanCheck(String siirto, Tuomari tuomari) {
        boolean willContinue = ("k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto));
        if (!willContinue) {
            System.out.println(tuomari);
        }
        return willContinue;
    }
}
