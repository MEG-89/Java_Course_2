package Task5.Operation;

public class Addition extends Operation {

    public Addition() {
        setOperator('+');
    }

    public double doMathOperation (double operand1, double operand2)
    {
        return operand1 + operand2;
    }
}
