import java.util.Scanner;

public class Calc2Test {

    public static void main(String[] args) {
        double options;

        do {
            double firstVal = input("Введите первое число");
            double secondVal = input("Введите второе число");


            Calc2 calc2 = new Calc2(firstVal, secondVal);
            System.out.println("Вы ввели числа " + firstVal + " и " + secondVal);
            System.out.println("Выберете действие");
            options = input(" 1. Сложить" + "\n 2. Вычесть" +
                    "\n 3. Умножить" + "\n 4. Разделить" + "\n 5. Остаток от деления" + "\n 0. Выход" + "\n");
            calc2.selected((int) options);

        } while (options != 0);

    }

    private static double input(String msg) {
        System.out.print(msg + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
