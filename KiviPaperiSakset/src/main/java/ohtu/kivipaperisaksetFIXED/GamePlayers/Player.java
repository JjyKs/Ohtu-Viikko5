package ohtu.kivipaperisaksetFIXED.GamePlayers;

import java.util.Scanner;

/**
 *
 * @author JjyKs
 */
public class Player {

    Scanner scanner = new Scanner(System.in);

    public String annaSiirto() {
        System.out.println("Pelaaja, anna syote (k, p, s)");
        String syote = scanner.nextLine();

        return syote;
    }

    public void asetaSiirto(String ekanSiirto) {

    }

}
