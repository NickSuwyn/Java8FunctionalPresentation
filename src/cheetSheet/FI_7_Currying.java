package cheetSheet;

import java.util.function.Function;

public class FI_7_Currying {

    //methodGreet a c b
    static String methodGreet(String a, String b, String c) {
        return a + " " + c + " " + b;
    }

    //functionGreet a c b
    static TriFunction<String, String, String, String> functionGreet = (a, b, c) -> a + " " + c + " " + b;

    //curriedGreet a c b
    static Function<String, Function<String, Function<String, String>>> curryGreet = a -> b -> c -> a + " " + c + " " + b;

    //custom TriFunction Interface
    @FunctionalInterface
    interface TriFunction<T, T2, T3, R> {
        R apply(T a, T2 b, T3 c);
    }

    public static void main(String[] args) {
        //first, last, name
        //method
        System.out.println(methodGreet("Hello", "how are you?", "Tom"));

        //function
        System.out.println(functionGreet.apply("Hello", "how are you?", "Tom"));

        //curried full
        System.out.println(curryGreet.apply("Hello").apply("how are you?").apply("Tom")); //why do this?

        //greetHello first arg
        Function<String, Function<String, String>> greetHello = curryGreet.apply("Hello");

        //greetHelloHowAreYou second arg
        Function<String, String> greetHelloHowAreYou = greetHello.apply("how are you?");

        //greatHelloNiceToSeeYou second arg
        Function<String, String> greetHelloNiceToSeeYou = greetHello.apply("nice to see you.");

        //greatHelloHowAreYou name
        System.out.println(greetHelloHowAreYou.apply("Bob"));

        //greatHelloNiceToSeeYou name
        System.out.println(greetHelloNiceToSeeYou.apply("Sam"));

    }
}
