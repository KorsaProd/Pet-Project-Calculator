import java.util.Scanner;

public class Calc2 {

    private final double a;
    private final double b;

    public Calc2 (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double sub() {
        return a - b;
    }

    public double div() {
        return a / b;
    }

    public double multi() {
        return a * b;
    }

    public double residue() {
        return a % b;
    }

    public double selected (int parameters) {
        switch (parameters) {
            case 1:
                System.out.println(add());
                break;
            case 2:
                System.out.println(sub());
                break;
            case 3:
                System.out.println(multi());
                break;
            case 4:
                System.out.println(div());
                break;
            case 5:
                System.out.println(residue());
                break;
            case 0:
                break;
            default:
                System.out.println("Вы выбрали неверный пункт");

        } return parameters;
    }
}
