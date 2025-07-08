package lab11.part2.prob12;

public class Main {
    public static void main(String[] args){
    MySingletonLazy first = MySingletonLazy.getInstance();
        MySingletonLazy second = MySingletonLazy.getInstance();

        System.out.println("First instance: " + first);
        System.out.println("Second instance: " + second);
        System.out.println("Same instance? " + (first == second));
    }
}