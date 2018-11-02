package cheetSheet;

import java.util.function.Predicate;

public class FI_0_Introduction {

    public static void main(String[] args) {
        String[] names = {"Tony", "Sam", "Tommy", "John", "Tibathy"};

        printNamesThatStartWithLetter(names, 'T');
        printNamesWithGivenLength(names, 4);
        printNamesWithLengthGreaterThan(names, 5);
        printNamesWithLengthLessThan(names, 4);

        System.out.println("---------------------------------------------");

        printNames(names, x -> x.charAt(0) == 'T');
        printNames(names, x -> x.length() == 4);
        printNames(names, x -> x.length() > 5);
        printNames(names, x -> x.length() < 4);

    }

    private static void printNamesThatStartWithLetter(String[] array, char letter) {
        for (String s : array) {
            if (s.charAt(0) == letter) {
                System.out.println(s);
            }
        }
        System.out.println();
    }

    private static void printNamesWithGivenLength(String[] array, int length) {
        for (String s : array) {
            if (s.length() == length) {
                System.out.println(s);
            }
        }
        System.out.println();
    }

    private static void printNamesWithLengthGreaterThan(String[] array, int length) {
        for (String s : array) {
            if (s.length() > length) {
                System.out.println(s);
            }
        }
        System.out.println();
    }

    private static void printNamesWithLengthLessThan(String[] array, int length) {
        for (String s : array) {
            if (s.length() < length) {
                System.out.println(s);
            }
        }
        System.out.println();
    }

    private static void printNames(String[] array, Predicate<String> condition) {
        for (String s : array) {
            if (condition.test(s)) {
                System.out.println(s);
            }
        }
        System.out.println();
    }
}

