import java.util.Scanner;

import static java.lang.Double.sum;

/**
 * @author Ekaterina M.
 */

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слагаемое:");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе слагаемое:");
        double num2 = scanner.nextDouble();
        scanner.close();
        System.out.printf("Сумма равна: \n" + "%.4f", sum(num1, num2));
    }

    /**
     * метод сложения двух чисел
     * @param num1 первое слагаемое
     * @param num2 второе слагаемое
     * @return возврат суммы
     */
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
}


