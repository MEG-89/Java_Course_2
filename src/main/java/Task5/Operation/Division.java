package Task5.Operation;

public class Division extends Operation {

    public Division() {
        setOperator('/');
    }

    public double doMathOperation (double operand1, double operand2)
    {
        return operand1 / operand2;
    }
}