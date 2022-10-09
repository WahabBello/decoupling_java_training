package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;


public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me
        long chosen_number = player.askNextGuess();
        if (this.numberToGuess == chosen_number) {
            logger.log("Bingo, vous avez gagné \n");
            return true;
        }
        logger.log("Perdu \n");
        player.respond(this.numberToGuess > chosen_number);
        return false;
    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me
        while(!nextRound()){
            nextRound();
        }
    }
}
