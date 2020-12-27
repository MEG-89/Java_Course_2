package Task5.Operation;

public abstract class Operation {
    private char operator;

    public char getOperator() {
        return operator;
    }

    protected void setOperator(char operator) {
        this.operator = operator;
    }

    public abstract double doMathOperation (double operand1, double operand2);
}
