package tech.balaji.hackerearth;

import java.util.ArrayList;
import java.util.List;

public class SquadStackFormingStrings {

    private static final List<String> list = new ArrayList<>();
    private static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    static void printAllKLength(int k) {
        printAllKLengthRec(new char[k], 0, k);
    }

    static boolean isCharA(char a) {
        return a == 'a';
    }

    static boolean isCharE(char a) {
        return a == 'e';
    }

    static boolean isCharI(char a) {
        return a == 'i';
    }

    static boolean isCharO(char a) {
        return a == 'o';
    }

    static boolean isCharU(char a) {
        return a == 'u';
    }

    static void printAllKLengthRec(char[] string, int currentIndex,
                                   int k) {
        if (k == 0) {
            list.add(new String(string));
            System.out.println(string);
            return;
        }

        for (char nextChar : vowels) {
            if (currentIndex > 0) {

                char currentChar = string[currentIndex - 1];

                if (isCharA(currentChar) && !(isCharE(nextChar) || isCharO(nextChar)))
                    continue;

                if (isCharE(currentChar) && !isCharI(nextChar))
                    continue;

                if (isCharI(currentChar) && isCharI(nextChar))
                    continue;

                if ((isCharO(currentChar) || isCharU(currentChar)) && !isCharI(nextChar))
                    continue;
            }
            // Next character of input added
            string[currentIndex] = nextChar;
            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(string, currentIndex + 1, k - 1);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        System.out.println("First Test");
        int k = 3;
        printAllKLength(k);
        System.out.println(list.size());
    }
}
