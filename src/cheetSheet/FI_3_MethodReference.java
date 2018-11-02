package cheetSheet;

import java.util.function.BiFunction;

public class FI_3_MethodReference {

    public static void main(String[] args) {
        System.out.println(processDoubles(5, 6, (a, b) -> a - b));
        System.out.println(processDoubles(5, 6, FI_3_MethodReference::multiply));
    }

    //Method to process two doubles a and b
    public static double processDoubles(double a, double b, BiFunction<Double, Double, Double> function) {
        return function.apply(a, b);
    }

    //Method multiply a and b
    public static double multiply(double a, double b) {
        return a * b;
    }


}
