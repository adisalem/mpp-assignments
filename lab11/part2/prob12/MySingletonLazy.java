package lab11.part2.prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static Optional<MySingletonLazy> instance = Optional.empty();

    private MySingletonLazy() {
        System.out.println("Singleton instance created.");
    }

    public static MySingletonLazy getInstance() {
        instance = Optional.ofNullable(instance.orElseGet(MySingletonLazy::new));
        return instance.get();
    }
}