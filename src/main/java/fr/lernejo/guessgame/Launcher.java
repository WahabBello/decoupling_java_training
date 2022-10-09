package fr.lernejo.guessgame;
import java.security.SecureRandom;

public class Launcher {
    public static void main (String[] args) {

        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextLong(1, 100);

        HumanPlayer joueur = new HumanPlayer();
        Simulation jeu = new Simulation(joueur);
        jeu.initialize(randomNumber);
        jeu.loopUntilPlayerSucceed();
    }
}
