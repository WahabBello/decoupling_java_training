package fr.lernejo.guessgame;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;

public class ComputerPlayer implements Player{
    Logger logger = LoggerFactory.getLogger("Computeur");
    @Override
    public long askNextGuess() {
        SecureRandom random = new SecureRandom();
        long chosen_number = random.nextLong(20, 80);
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
