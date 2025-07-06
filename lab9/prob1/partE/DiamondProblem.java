package lab9.prob1.partE;

public class DiamondProblem {
    public static void main(String[] args) {
        
        D d = new D();
        d.method(); 
        
        DInterface dInterface = new DInterface() {};
        dInterface.method(); 
       
    }
}

interface A{
    default void method() {
        System.out.println("A's method");
    }
}
interface B extends A {
    @Override
    default void method() {
        System.out.println("B's method");
    }
}
interface C extends A {
    @Override
    default void method() {
        System.out.println("C's method");
    }
}

class D implements B, C {
    @Override
    public void method() {
        System.out.println("class D's method");
        // Can call B.super.method() or C.super.method() if needed
    }
}
interface DInterface extends B, C {
    @Override
    default void method() {
        System.out.println("interface D's method");
        // Can call B.super.method() or C.super.method() if needed
    }
}
