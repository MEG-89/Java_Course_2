package Task5;

import Task5.Operation.Operation;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<Character, Operation> operatorMap = new HashMap<Character, Operation>();

    public boolean addOperator(Operation operation) {
        if (operatorMap.containsKey(operation.getOperator()))
            return false;

        operatorMap.put(operation.getOperator(), operation);
        return true;
    }

    public String calculate(String text) {
        String result = "Ошибка";
        String subStr1 = "";
        String subStr2 = null;
        char operator = ' ';

        for (Map.Entry<Character, Operation> pair : operatorMap.entrySet()) {
            char key = pair.getKey();

            if (text.contains(Character.toString(key))) {
                operator = key;
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) != operator)
                        subStr1 = subStr1 + text.charAt(i);
                    else if (text.charAt(i) == operator) {
                        subStr2 = text.substring(i + 1);
                        break;
                    }
                }
            }

            if (subStr2 != null)
                break;
        }


        try {
            double operand1 = Double.parseDouble(subStr1);
            double operand2 = Double.parseDouble(subStr2);
            result = text + "=" + operatorMap.get(operator).doMathOperation(operand1, operand2);

        } catch (NumberFormatException e) {
        }

        return result;
    }
}
