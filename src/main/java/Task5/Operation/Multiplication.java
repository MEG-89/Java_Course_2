package Task5.Operation;

public class Multiplication extends Operation {

    public Multiplication() {
        setOperator('*');
    }

    public double doMathOperation (double operand1, double operand2)
    {
        return operand1 * operand2;
    }
}
