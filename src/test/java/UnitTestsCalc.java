import Task7.CalculatorInt;
import Task7.Operation.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ekaterina M.
 */


public class UnitTestsCalc
{
    @Test
    public void testAddition()
    {
        Addition addition = new Addition();
        Assert.assertEquals("Ошибка сложения", 2.0, addition.doMathOperation(1, 1), 0);
    }

    @Test
    public void testAdditionOperator()
    {
        Addition addition = new Addition();
        Assert.assertEquals("Ошибка обозначения оператора сложения", '+', addition.getOperator());
    }

    @Test
    public void testSubtraction()
    {
        Subtraction subtraction = new Subtraction();
        Assert.assertEquals("Ошибка вычитания", 2.0, subtraction.doMathOperation(4, 2), 0);
    }

    @Test
    public void testSubtractionOperator()
    {
        Subtraction subtraction = new Subtraction();
        Assert.assertEquals("Ошибка обозначения оператора вычитания", '-', subtraction.getOperator());
    }

    @Test
    public void testMultiplication()
    {
        Multiplication multiplication = new Multiplication();
        Assert.assertEquals("Ошибка умножения", 6.0, multiplication.doMathOperation(2, 3), 0);
    }

    @Test
    public void testMultiplicationOperator()
    {
        Multiplication multiplication = new Multiplication();
        Assert.assertEquals("Ошибка обозначения оператора умножения", '*', multiplication.getOperator());
    }

    @Test
    public void testDivision()
    {
        Division division = new Division();
        double d = 0.0;
        try
        {
            d = division.doMathOperation(8, 4);
        } catch (Exception e)
        {
            Assert.assertTrue(e.getMessage(), false);
        }
        Assert.assertEquals("Ошибка деления", 2.0, d, 0);
    }

    @Test
    public void testDivisionOperator()
    {
        Division division = new Division();
        Assert.assertEquals("Ошибка обозначения оператора деления", '/', division.getOperator());
    }

    @Test
    public void testAddOperator()
    {
        CalculatorInt calculator = new CalculatorInt();
        String result1 = calculator.calculate("9+2");
        Assert.assertEquals("Ошибка оператора", "Не найден арифметический оператор.", result1);
        calculator.addOperator(new Addition());
        String result2 = calculator.calculate("9+2");
        Assert.assertEquals("Ошибка добавления оператора", "9+2=11.0", result2);
    }

    @Test
    public void testCalculator()
    {
        CalculatorInt calculator = new CalculatorInt();
        calculator.addOperator(new Addition());
        calculator.addOperator(new Subtraction());
        calculator.addOperator(new Multiplication());
        calculator.addOperator(new Division());
        Assert.assertEquals("Ошибка калькулятора - сложение", "18+0=18.0", calculator.calculate("18+0"));
        Assert.assertEquals("Ошибка калькулятора - вычитание", "18-2=16.0", calculator.calculate("18-2"));
        Assert.assertEquals("Ошибка калькулятора - умножение", "6*3=18.0", calculator.calculate("6*3"));
        Assert.assertEquals("Ошибка калькулятора - деление", "18/2=9.0", calculator.calculate("18/2"));
    }
}