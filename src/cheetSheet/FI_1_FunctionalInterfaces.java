package cheetSheet;

import java.util.function.*;

public class FI_1_FunctionalInterfaces {

    //Function<T, R>
    static Function<String, Integer> processString = x -> x.length();

    //IntFunction<R>, LongFunction, DoubleFunction
    static IntFunction<Integer> doSomethingWithInt = x -> x * 2;

    //BiFunction<T, U, R>
    static BiFunction<String, Integer, String>  doSomethingWithStringAndInt = (s, i) -> {
        StringBuilder result = new StringBuilder();
        for (int x = 0; x < i; x++) {
            result.append(s);
        }
        return result.toString();
    };

    //Supplier<R> supplies values, generates values
    static Supplier<String> supplyEmpty = () -> "";

    //Consumer<T>
    static Consumer<String> consumeString = x -> System.out.println(x);

    //Predicate<T>
    static Predicate<String> isOdd = x -> x.length() % 2 == 1;

    //UnaryOperator<T>
    static UnaryOperator<String> toUpper = x -> x.toUpperCase();

    //BinaryOperator<T>
    static BinaryOperator<Integer> multiply = (x, y) -> x * y;

    public static void main(String[] args) {
        System.out.println(processString.apply("Hello"));
        System.out.println(doSomethingWithInt.apply(3));
        System.out.println(doSomethingWithStringAndInt.apply("Hello", 3));
        consumeString.accept("Goodbye");
        System.out.println("Hello has odd length of characters: " + isOdd.test("Hello"));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
