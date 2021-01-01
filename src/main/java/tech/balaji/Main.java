package tech.balaji;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        CustomLogger logger = CustomLogger.getLogger(Main.class);
        Logger logger1 = LoggerFactory.getLogger(Main.class);

        try {
            Integer i = Integer.parseInt("asd");
        } catch (Exception throwable) {
            logger.error("Exception  occurred", throwable);
            logger1.error("Exception occurred", throwable);
        }

        logger.info("Hello world");
        Object userName = "Balaji";
        logger.info("User Name : {}", userName);

        Object department = "\n\nCSE";
        logger.info("Users Name : {} \n department : {} \n", userName, department);

        Integer age = 12;
        logger.info("Users Name : {} \n department : {} \n age : {}", userName, department, age);

    }
}
