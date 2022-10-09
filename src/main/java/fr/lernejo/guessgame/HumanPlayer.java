package fr.lernejo.guessgame;

import java.util.Scanner;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class HumanPlayer implements Player{
    Logger logger = LoggerFactory.getLogger("Player");

    @Override
    public long askNextGuess() {
        System.out.println("Saissisez un numéro svp : ");
        Scanner sc = new Scanner(System.in);
        long chosen_number = sc.nextLong();
        return chosen_number;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater == true ) {
            logger.log("Trop petit \n");
        }else
            logger.log("Trop grand \n");
    }
}
