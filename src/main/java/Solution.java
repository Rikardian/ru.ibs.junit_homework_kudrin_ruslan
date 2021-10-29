import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String fileName = "";
        boolean isCorrect;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            fileName = reader.readLine();
        }catch (IOException e){
            System.out.println("Неправильное имя файла");
        }

        Solution solution = new Solution();
        isCorrect = solution.checkFile(solution.readFile(fileName));

        if (isCorrect)
        solution.fizzBuzzer(fileName);
    }

    public List<String> readFile(String fileName){
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while (reader.ready()){
                result.add(reader.readLine());
            }
            return result;
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден!");
        } catch (IOException e){
            System.out.println("Введены невалидные данные");
        }
        return null;
    }

    public List<String> numberChanger (List<String> list){
        List<String> result = new ArrayList<>();

        for (String value : list){
            int num = Integer.parseInt(value);
            if (num % 5 == 0 && num % 3 == 0){
                result.add("FizzBuzz");
            }
            else if (num % 5 == 0){
                result.add("Buzz");
            }
            else if (num % 3 == 0){
                result.add("Fizz");
            }
            else result.add(value);
        }
        return result;
    }

    public void fizzBuzzer(String fileName){
        List<String> result = numberChanger(readFile(fileName));
        result.forEach(System.out::println);
    }

    public boolean checkFile(List<String> list){
        boolean isCorrect = true;
        try {
            for (String value : list) {
                int num = Integer.parseInt(value);
            }
        } catch (NumberFormatException e){
            System.out.println("Файл имеет некорректное содержание");
            isCorrect = false;
        }
        return isCorrect;
    }
}
