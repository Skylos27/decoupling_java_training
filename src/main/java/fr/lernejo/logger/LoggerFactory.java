package fr.lernejo.logger;

public class LoggerFactory{
    public static Logger getLogger(String name) {
        Logger logger;
        logger = System.out::println;
        return logger;
    }
}
