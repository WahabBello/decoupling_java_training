package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger{

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    public ContextualLogger(Class callerClass, Logger log, String message ){
        log.log(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);
    }
    @Override
    public void log(String message) {
        
    }
}
