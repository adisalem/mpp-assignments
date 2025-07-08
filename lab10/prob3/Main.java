package lab10.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Double, Double, List<Double>> biFunction = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add(x * y);
            return list;
        };
        
        List<Double> result = biFunction.apply(2.0, 3.0);
        
        System.out.println("Result: " + result);
        System.out.println("Math.pow(2.0, 3.0) = " + result.get(0));
        System.out.println("2.0 * 3.0 = " + result.get(1));
    }
}
