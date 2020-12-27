import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

public class Task6
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите полное имя файла:");
        String text = readFile(reader.readLine());
        if (text == null)
        {
            System.out.println("Ошибка при работе с файлом");
            return;
        }

        String[] words = SplitString(text);
        Arrays.sort(words);
        Map<String, Integer> countedWords = countWords(words);
        printCountedWords(countedWords);
        printMax(countedWords);
    }

    private static void printMax(Map<String, Integer> countedWords)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(countedWords.values());
        int max = Collections.max(list);
        String word = null;

        for (Map.Entry<String, Integer> pair : countedWords.entrySet())
        {
            if (pair.getValue().equals(max))
            {
                word = pair.getKey();
                break;
            }
        }

        if (word != null)
            System.out.println("Чаще всего встречается слово " + word + " - встречается в файле " + max + " раз(а).");
    }

    public static void printCountedWords(Map<String, Integer> countedWords)
    {
        for (Map.Entry<String, Integer> pair : countedWords.entrySet())
        {
            System.out.println("Слово " + pair.getKey() + " встречается в файле " + pair.getValue() + " раз(а).");
        }
    }

    public static Map<String, Integer> countWords(String[] words)
    {
        Map<String, Integer> countedWords = new HashMap<String, Integer>();

        for (int i = 0; i < words.length; i++)
        {
            String key = words[i];
            if (countedWords.containsKey(key))
                countedWords.put(key, countedWords.get(key) + 1);
            else
                countedWords.put(key, 1);
        }

        return countedWords;
    }

    public static String[] SplitString(String text)
    {
        String[] words = text.split("\\s");
        return words;
    }

    public static String readFile(String fileName)
    {
        BufferedReader reader;
        try
        {
            reader = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();

            while (line != null)
            {
                sb.append(line + " ");
                line = reader.readLine();
            }
            return sb.toString();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        return null;
    }


}

