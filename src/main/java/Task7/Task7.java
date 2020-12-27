package Task7;

import Task7.Operation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Ekaterina M.
 */

public class Task7 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CalculatorInt calculator = new CalculatorInt();
        calculator.addOperator(null);
        calculator.addOperator(new Addition());
        calculator.addOperator(new Subtraction());
        calculator.addOperator(new Multiplication());
        calculator.addOperator(new Division());

        System.out.println("Введите выражение (например, 2+2):");
        System.out.println(calculator.calculate(reader.readLine()));
    }
}
