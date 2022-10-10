package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.text.SimpleDateFormat;


public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type
    private boolean nextround; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        long chosen_number = player.askNextGuess();
//        System.out.print(this.numberToGuess);
        if (this.numberToGuess == chosen_number) {
            logger.log("bravo \n");
            this.nextround = true;
            return true;
        }
        logger.log("Perdu \n");
        player.respond(this.numberToGuess > chosen_number);
        this.nextround = false;
        return false;
    }

    public void loopUntilPlayerSucceed(int nbrItMax) {
        long tempsDebut, tempsFin;
        tempsDebut = System.currentTimeMillis();
        int nbrIt = 0;
        SimpleDateFormat formater = new SimpleDateFormat("mm:ss.SSS");

        while(!this.nextround){
            nextRound();
            nbrIt++;
        }

        tempsFin = System.currentTimeMillis();
        float seconds = (tempsFin - tempsDebut) / 1000F;
//        logger.log(nbrIt + " \n");
//        logger.log(nbrItMax + " \n");
        if (nbrIt <= nbrItMax) {
            logger.log("Dans le temps du nombre de tentatives\n");
        }else {
            logger.log("Nombre de tentatives dépassées \n");
        }

        logger.log("Temps de l'opération = "+ formater.format(seconds) + " secondes.\n");

    }
}
