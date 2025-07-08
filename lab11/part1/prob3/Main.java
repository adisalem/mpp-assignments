package lab11.part1.prob3;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        final Stream<Integer> primes = Stream.iterate(2, Main::nextPrime);
        
        primes.limit(10).forEach(System.out::println);
    }
    
    private static int nextPrime(int current) {
        int candidate = current + 1;
        while (!isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }
    
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
