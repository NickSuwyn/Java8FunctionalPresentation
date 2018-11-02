package cheetSheet;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FI_2_LamdaRules {

    //no parameter, needs parentheses
    Supplier<Double> supplyRandom = () -> Math.random();

    //one parameter, no parentheses
    Function<Integer, Integer> doSomething = x -> x * 2;

    //one parameter with type, need parentheses
    Consumer<String> print = (String x) -> System.out.println(x);

    //two parameters, need parentheses
    BiFunction<String, String, String> createFullName = (x, y) -> x + " " + y;

    //multiple lines need brackets, return must be explicit when brackets available, without brackets return is implicit
    static BiFunction<String, Integer, String>  doSomethingWithStringAndInt = (s, i) -> {
        StringBuilder result = new StringBuilder();
        for (int x = 0; x < i; x++) {
            result.append(s);
        }
        return result.toString();
    };

}
