package ohtu.kivipaperisaksetFIXED;

import ohtu.kivipaperisaksetFIXED.GamePlayers.PelaajaTehdas;

import java.util.Scanner;
import ohtu.kivipaperisaksetFIXED.GamePlayers.Player;

/**
 *
 * @author JjyKs
 */
public class PääohjelmaFixd {

    private static final Scanner scanner = new Scanner(System.in);
    private static boolean running = true;
    private static PeliHandler peliHandler = new PeliHandler();

    public static void main(String[] args) {
        while (running) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
            running = peliHandler.pelaa(scanner.nextLine());
        }
    }

}
