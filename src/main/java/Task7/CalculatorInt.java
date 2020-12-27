package Task7;

import Task7.Operation.Operation;

import java.util.HashMap;
import java.util.Map;

public class CalculatorInt
{

    private Map<Character, Operation> operatorMap = new HashMap<Character, Operation>();

    public boolean addOperator(Operation operation)
    {
        try
        {
            if (operatorMap.containsKey(operation.getOperator())) return false;

            operatorMap.put(operation.getOperator(), operation);
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Произошла ошибка в методе addOperator: " + e);
        }

        return false;
    }

    public String calculate(String text)
    {
        String subStr1 = "";
        String subStr2 = null;
        char operator = ' ';

        for (Map.Entry<Character, Operation> pair : operatorMap.entrySet())
        {
            char key = pair.getKey();

            if (text.contains(Character.toString(key)))
            {
                operator = key;
                for (int i = 0; i < text.length(); i++)
                {
                    if (text.charAt(i) != operator) subStr1 = subStr1 + text.charAt(i);
                    else
                        if (text.charAt(i) == operator)
                        {
                            subStr2 = text.substring(i + 1);
                            break;
                        }
                }
            }

            if (subStr2 != null) break;
        }


        try
        {
            return text + "=" + operatorMap.get(operator).doMathOperation(Integer.parseInt(subStr1), Integer.parseInt(subStr2));
        }
        catch (Exception e)
        {
            return "Произошла ошибка в методе calculate: " + e;
        }
    }
}
