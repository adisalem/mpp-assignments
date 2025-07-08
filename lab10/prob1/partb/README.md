# short answer part b 
## I .  rewrite the method reference `Math::random` as lambda expression
- Supplier<Double> randomSupplier = () -> Math.random();
