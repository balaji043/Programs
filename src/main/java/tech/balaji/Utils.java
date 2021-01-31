package tech.balaji;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {

    public static void print(Object expected, Object actual) {
        System.out.printf((Constants.OUTPUT) + "%n", expected, actual);
    }
}
