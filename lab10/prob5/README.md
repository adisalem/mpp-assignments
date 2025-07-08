# Lambda and Method Reference Exercises

### Example 1: Convert string to upper case

```java
Function<String, String> toUpper1 = (String x) -> x.toUpperCase();
Function<String, String> toUpper2 = String::toUpperCase; // Method reference type: Class::instanceMethod
```

---

### Example 2: Print a string

```java
Consumer<String> print1 = (s) -> System.out.println(s);
Consumer<String> print2 = System.out::println; // Method reference type: Class::staticMethod
```

---

### Example 3: Parse an integer

```java
Function<String, Integer> parse1 = (s) -> Integer.parseInt(s);
Function<String, Integer> parse2 = Integer::parseInt; // Method reference type: Class::staticMethod
```

---

### Example 4: Compare two strings ignoring case

```java
BiFunction<String, String, Integer> compare1 = (s1, s2) -> s1.compareToIgnoreCase(s2);
BiFunction<String, String, Integer> compare2 = String::compareToIgnoreCase; // Method reference type: Class::instanceMethod
```

---

### Example 5: Check if a list is empty

```java
Predicate<List<?>> isEmpty1 = (list) -> list.isEmpty();
Predicate<List<?>> isEmpty2 = List::isEmpty; // Method reference type: Class::instanceMethod
```

---

### Example 6: Get the length of a string

```java
Function<String, Integer> length1 = (s) -> s.length();
Function<String, Integer> length2 = String::length; // Method reference type: Class::instanceMethod
```


