import java.util.Arrays;
import java.util.List;

public class FI_4_Streams {

    static List<String> names = Arrays.asList("Melvin", "Joe", "Caleb", "Nick", "Michael", "Tim", "Steve", "Derek");

    public static void main(String[] args) {
        //forEach
        names.stream()
                .forEach(x -> System.out.println(x));

        System.out.println("-----------------------------------");

        //map and print the length
        names.stream()
                .filter(x -> x != null)
                .map(x -> x.length())
                .forEach(x -> System.out.println(x));

        System.out.println("-----------------------------------");

        //filter only show names with even length
        names.stream()
                .filter(x -> x.length() % 2 == 0)
                .forEach(x -> System.out.println(x));

        System.out.println("-----------------------------------");

        //mapToInt total characters
        System.out.println(
                names.stream()
                    .mapToInt(x -> x.length())
                    .sum()
        );

        System.out.println("-----------------------------------");

        //mapToDouble average characters

        System.out.println("-----------------------------------");

        //reduce with multiply :: - reduce is a general-purpose reduction, whereas sum or average are specific
        System.out.println(
                names.stream().mapToInt(x -> x.length())
                    .reduce(1, (x, y) -> x * y)
        );

        System.out.println("-----------------------------------");

        //filer by contains e, map to reverse, print

    }


}
