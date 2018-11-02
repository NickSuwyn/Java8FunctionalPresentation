import sun.dc.pr.PRError;

import java.util.function.*;

public class FI_1_FunctionalInterfaces {

    public static void main(String[] args) {
        //test all
        System.out.println(countLetters.apply("something"));
        System.out.println(multiplyString.apply("Hello", 3));
    }

    //Function<T, R>  countLetters
    static Function<String, Integer> countLetters = x -> x.length();


    //IntFunction<R>, LongFunction, DoubleFunction  square
    IntFunction<Integer> square = x -> x * x;


    //BiFunction<T, U, R>  multiplyString
    static BiFunction<String, Integer, String> multiplyString = (str, num) -> {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append(str);
        }
        return result.toString();
    };


    //Supplier<R>  supplyRandom
    Supplier<Double> supplyRandom = () -> Math.random();


    //Consumer<T>  greetPeople
    Consumer<String> greetPeople = x -> System.out.println("Hello, " + x);


    //Predicate<T>  isLengthEven
    Predicate<String> isLengthEven = x -> x.length() % 2 == 0;

    //UnaryOperator<T>  reverse
    UnaryOperator<String> reverse = x -> new StringBuilder(x).reverse().toString();


    //BinaryOperator<T>  multiply


}
