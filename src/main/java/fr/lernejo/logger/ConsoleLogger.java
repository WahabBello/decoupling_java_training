package fr.lernejo.logger;

public class ConsoleLogger implements Logger {

    public ConsoleLogger(){
    }

    @Override
    public void log(String message){
        System.out.print(message);
    }
}
