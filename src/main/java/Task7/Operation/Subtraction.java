package Task7.Operation;

public class Subtraction  extends Operation {

    public Subtraction() {
        setOperator('-');
    }

    public double doMathOperation (int operand1, int operand2)
    {
        return operand1 - operand2;
    }
}
