# Prob 1 answer

## a. First fragment
```java
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<Number> nums = ints;
nums.add(3.14);
```
**Compiler error:**
- Error at `List<Number> nums = ints;`
- Java does not allow assigning `List<Integer>` to `List<Number>` because generics are not covariant. If allowed, you could add a `Double` to a list of `Integer`, which is unsafe.

---

## b. Second fragment
```java
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<? extends Number> nums = ints;
nums.add(3.14);
```
**Compiler error:**
- Error at `nums.add(3.14);`
- You cannot add to `nums` because with `List<? extends Number>`, the compiler does not know the exact type (could be Integer, Double, etc.), so adding is not safe.

