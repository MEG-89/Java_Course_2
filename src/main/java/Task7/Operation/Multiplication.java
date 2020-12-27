package Task7.Operation;

public class Multiplication extends Operation {

    public Multiplication() {
        setOperator('*');
    }

    public double doMathOperation (int operand1, int operand2)
    {
        return operand1 * operand2;
    }
}
