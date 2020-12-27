package Task7.Operation;

public class Division extends Operation {

    public Division() {
        setOperator('/');
    }

    public double doMathOperation (int operand1, int operand2) throws Exception
    {
        return operand1 / operand2;
    }
}