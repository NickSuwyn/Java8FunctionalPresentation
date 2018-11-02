import java.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;

public class FI_3_MethodReference {

    static DoubleBinaryOperator subtract = (x, y) -> x - y;

    public static void main(String[] args) {

        //minus
        System.out.println(processDoubles(6, 4, subtract));

        //method reference multiply
        System.out.println(processDoubles(5, 4, FI_3_MethodReference::multiply));


    }

    //Method to process two doubles a and b
    static double processDoubles(double a, double b, DoubleBinaryOperator function) {
        return function.applyAsDouble(b, a);
    }


    //Method multiply a and b
    static double multiply(double a, double b) {
        return a * b;
    }

}
