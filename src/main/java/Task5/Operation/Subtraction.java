package Task5.Operation;

public class Subtraction  extends Operation {

    public Subtraction() {
        setOperator('-');
    }

    public double doMathOperation (double operand1, double operand2)
    {
        return operand1 - operand2;
    }
}
