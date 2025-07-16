# Prob 4 Answers

## a. Compiler errors?
```java
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<? extends Number> nums = ints;
double dbl = sum(nums);
nums.add(3.14);
```
- Error at `nums.add(3.14);` — cannot add to a `List<? extends Number>` (except null), because the compiler does not know the exact type.
- The rest is valid, no error.

## b. Compiler errors?
```java
List<Object> objs = new ArrayList<>();
objs.add(1);
objs.add("two");
List<? super Integer> ints = objs;
ints.add(3);
double dbl = sum(ints);
```
- Error at `double dbl = sum(ints);` — `sum` expects a `Collection<? extends Number>`, but `List<? super Integer>` could contain any supertype of Integer (like Object), so not safe.
- The rest is valid, no error.
