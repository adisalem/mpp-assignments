package lab5.prob2;
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("displaying");
    }
}