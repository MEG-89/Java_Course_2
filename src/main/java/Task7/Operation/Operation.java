package Task7.Operation;

public abstract class Operation {
    private char operator;

    public char getOperator() {
        return operator;
    }

    protected void setOperator(char operator) {
        this.operator = operator;
    }

    public abstract double doMathOperation (int operand1, int operand2) throws Exception;
}
