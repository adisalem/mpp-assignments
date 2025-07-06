# Java 8 Diamond Problem Resolution

When interfaces B and C both override a default method from interface A, and D inherits from both B and C, Java cannot determine which method to use. This creates the **Diamond Problem**.

```
       A (default method)
      / \
     B   C (override A's method)
      \ /
       D (conflict!)
```

**Rule**: When ambiguity exists, we must explicitly override the method in D.

## Case 1: Class D implements B, C

**Problem:**
```java
class D implements B, C { } // Compilation error!
```

**Solution:**
```java
class D implements B, C {
    @Override
    public void method() {
        System.out.println("class D's method");
        // Can call B.super.method() or C.super.method() if needed
    }
}
```

## Case 2: Interface D extends B, C

**Problem:**
```java
interface A { default void method() { System.out.println("A's method"); } }
interface B extends A { default void method() { System.out.println("B's method"); } }
interface C extends A { default void method() { System.out.println("C's method"); } }
interface D extends B, C { } // Compilation error!
```

**Solution:**
```java
interface DInterface extends B, C {
    @Override
    default void method() {
        System.out.println("interface D's method");
        // Can call B.super.method() or C.super.method() if needed
    }
}
```
