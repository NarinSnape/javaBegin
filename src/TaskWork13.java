import java.util.Scanner;

public class TaskWork13 {
    public static void main(String[] args) {
        //Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
        Scanner scanner = new Scanner(System.in);
        System.out.println(">Введите строку из слов, разделенных пробелами: \n" +
                ">(например, “I love java 8 Я люблю java 14 core1”");
        String str = scanner.nextLine();
        scanner.close();
        // Выполните следующие действия:
        //1. Выведите слова, состоящие только из латиницы:
        String[] splitWords = str.trim().split(" ");
        String[] latinWords = new String[splitWords.length];
        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].matches("^[a-z,A-Z]+$")) {
                latinWords[i] = splitWords[i];
                System.out.print(latinWords[i] + " ");
            }
        }
        //System.out.println();
        //2. Выведите количество этих слов:
        int amount = 0;
        for (String word : latinWords) {
            if (word != null)
                amount++;
        }
        System.out.println("\nКоличество слов, содержащих только латиницу: " + amount);
    }
}