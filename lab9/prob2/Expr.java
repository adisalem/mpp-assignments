package lab9.prob2;

public sealed interface Expr permits Constant, Addition, Multiplication {
    int eval(Expr expr);
}

final class Constant implements Expr {
    private final int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public int eval(Expr expr) {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

final class Addition implements Expr {
    private final Expr left;
    private final Expr right;

    public Addition(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int eval(Expr expr) {
        return left.eval(expr) + right.eval(expr);
    }

    @Override
    public String toString() {
        return "(" + left + " + " + right + ")";
    }
}

final class Multiplication implements Expr {
    private final Expr left;
    private final Expr right;

    public Multiplication(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int eval(Expr expr) {
        return left.eval(expr) * right.eval(expr);
    }

    @Override
    public String toString() {
        return "(" + left + " * " + right + ")";
    }
}

class Main {

    public static void main(String[] args) {
        Expr expr = new Multiplication(
                new Addition(new Constant(2), new Constant(3)),
                new Constant(4));
        System.out.println(expr + " = " + expr.eval(expr));
    }
}
