package Task5;

import Task5.Operation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Ekaterina M.
 */

public class Task5 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Calculator calculator = new Calculator();
        calculator.addOperator(new Addition());
        calculator.addOperator(new Subtraction());
        calculator.addOperator(new Multiplication());
        calculator.addOperator(new Division());

        System.out.println("Введите выражение (например, 2+2):");
        System.out.println(calculator.calculate(reader.readLine()));
    }
}
