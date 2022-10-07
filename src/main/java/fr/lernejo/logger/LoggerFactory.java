package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String message){
        ConsoleLogger log = new ConsoleLogger();
        return log;
    }
}
