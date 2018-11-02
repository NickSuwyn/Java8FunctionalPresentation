package cheetSheet;

import java.util.Arrays;
import java.util.List;

public class FI_4_Streams {

    static List<String> names = Arrays.asList("Melvin", "Joe", "Caleb", "Nick", "Michael", "Tim", "Steve", "Derek");

    public static void main(String[] args) {

        //forEach
        names.stream()
                .forEach(x -> System.out.println(x));

        //map
        names.stream()
                .map(x -> x.length())
                .forEach(x -> System.out.println(x));

        //filter
        names.stream()
                .filter(x -> x.length() % 2 == 0)
                .forEach(x -> System.out.println(x));

        //total characters
        System.out.println(names.stream()
                .mapToInt(x -> x.length())
                .sum());

        //average characters
        System.out.println(names.stream()
                .mapToDouble(x -> x.length())
                .average());

        //reduce with multiply - reduce is a general-purpose reduction, whereas sum or average are specific
        System.out.println(names.stream()
                .mapToInt(String::length) //note method reference works though in this case it's longer
                .reduce(1, (a, b) -> a * b));

        //filer, reverse, print
        names.stream()
                .filter(x -> x.toLowerCase().contains("e"))
                .map(x -> new StringBuilder(x).reverse().toString())
                .forEach(x -> System.out.println(x));

    }
}
