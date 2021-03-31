/*
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        double actions;
            do {
                double firstVal = input("Введите первое число");

                double secondVal = input("Введите второе число");

                System.out.println("Вы ввели числа " + firstVal + "и " + secondVal);
                System.out.println("Выберете действие");
                actions = input("\n 1. Сложить" + "\n 2. Вычесть" +
                        "\n 3. Умножить" + "\n 4. Разделить" + "\n 5. Остаток от деления" + "\n 0. Выход" + "\n");
                double rez = 0;
                if (actions == 1) {
                    rez = firstVal + secondVal;
                }
                if (actions == 2) {
                    rez = firstVal - secondVal;
                }
                if (actions == 3) {
                    rez = firstVal * secondVal;
                }
                if (actions == 4) {
                    rez = firstVal / secondVal;
                }
                if (actions == 5) {
                    rez = firstVal % secondVal;
                }
                System.out.println(rez);
            } while (actions != 0);

    }
    private static double input(String msg) {
        System.out.print(msg + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}

*/
