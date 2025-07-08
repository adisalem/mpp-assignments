package lab10.prob1.partb;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // implementation I
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());
        // implementation II
        Supplier<Double> innerRandomSupplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };
        System.out.println("Random number from inner class: " + innerRandomSupplier.get());
    }

}
