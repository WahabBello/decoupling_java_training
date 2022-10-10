package fr.lernejo.guessgame;
import java.security.SecureRandom;

public class Launcher {
    public static void main (String[] args) {

        if (args[0].equals("-interactive")) {
            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextLong(20, 80);
    
            HumanPlayer human = new HumanPlayer();
            Simulation jeu = new Simulation(human);
    
            jeu.initialize(randomNumber);
            jeu.loopUntilPlayerSucceed(Long.MAX_VALUE);
            
        }else if (args[0].equals("-auto")) {    
            ComputerPlayer computer = new ComputerPlayer();
            Simulation jeu = new Simulation(computer);
    
            jeu.initialize(Long.parseLong(args[1]));
            jeu.loopUntilPlayerSucceed(1000);
            
        }else {
            System.out.print("Vous devez choisir entre les 2 choix");          
        }
    }
}
