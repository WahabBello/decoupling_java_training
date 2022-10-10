package fr.lernejo.logger;

import java.util.function.Predicate;

public class FilteredLogger implements Logger{


    public FilteredLogger(Logger delegate, Predicate<String> condition) {
        //TODO assign arguments to fields
    }

    @Override
    public void log(String message) {

    }
}
