import java.util.Scanner;

import static java.lang.Double.sum;

/**
 * @author Ekaterina M.
 */

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для запуска калькулятора нажмите - 1\nДля поиска самого длинного слова нажмите - 2");
        int choise = scanner.nextInt();


        if (choise == 1)
            calculator();
        if (choise == 2)
            findLongestWord();
    }

    public static void calculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();
        System.out.println("Для сложения нажмите - 1\nДля вычитания нажмите - 2\nДля умножения нажмите - 3\nДля деления нажмите - 4");
        int choise = scanner.nextInt();
        scanner.close();

        switch (choise) {
            case 1:
                System.out.printf("Результат сложения: \n" + "%.4f", sum(num1, num2));
                break;
            case 2:
                System.out.printf("Результат вычитания: \n" + "%.4f", subtraction(num1, num2));
                break;
            case 3:
                System.out.printf("Результат умножения: \n" + "%.4f", multiplication(num1, num2));
                break;
            case 4:
                System.out.printf("Результат деления: \n" + "%.4f", division(num1, num2));
                break;
        }
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static void findLongestWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество слов:");
        int num = scanner.nextInt();
        String[] words = new String[num];
        int max = 0;
        String LongestWord = "";
        System.out.println("Введите слова:");
        for (int i = 0; i < num; i++)
            words[i] = scanner.next();

        for (int i = 0; i < words.length; i++) {
            {
                if (words[i].length() > max) {
                    max = words[i].length();
                    LongestWord = words[i];
                }
            }
        }

        System.out.println("Самое длинное слово: " + LongestWord);
        System.out.println("Его длина: " + max);
        scanner.close();

    }
}