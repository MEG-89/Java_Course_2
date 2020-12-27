package Task7.Operation;

public class Addition extends Operation {

    public Addition() {
        setOperator('+');
    }

    public double doMathOperation (int operand1, int operand2)
    {
        return operand1 + operand2;
    }
}
