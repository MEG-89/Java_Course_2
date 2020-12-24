import java.util.Random;

/**
 * @author Ekaterina M.
 */

public class Task4_1 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        putNumbers(numbers);
        int maxNegativeValue = -10;
        int minPositiveValue = 10;
        int maxNegativeIndex = -1;
        int minPositiveIndex = -1;

        for (int i = 0; i < 20; i++) {
            if (numbers[i] < 0 && numbers[i] > maxNegativeValue) {
                maxNegativeIndex = i;
                maxNegativeValue = numbers[i];
            }
            if (numbers[i] > 0 && numbers[i] < minPositiveValue) {
                minPositiveIndex = i;
                minPositiveValue = numbers[i];
            }
        }

        if (maxNegativeIndex > -1 && minPositiveIndex > -1) {
            numbers[maxNegativeIndex] = minPositiveValue;
            numbers[minPositiveIndex] = maxNegativeValue;
        }
    }

    public static void putNumbers(int[] numbers) {
        for (int i = 0; i < 20; i++) {
            int randomNumber = (int) (Math.random() * (20 + 1)) - 10;
            numbers[i] = randomNumber;
        }
    }
}

