import java.util.Scanner;

public class FinalTaskWork03 {
    public static void main(String[] args) {
        //Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
        Scanner scanner = new Scanner(System.in);
        System.out.println(">Количество строк: ");
        int length = scanner.nextInt();
        String[] rows = new String[length];
        for (int i = 0; i < length; i++) {
            scanner.useDelimiter("\\n");
            System.out.println("Строка " + (i + 1) + ":");
            rows[i] = scanner.next();
        }
        //Среди данных строк найти строку с максимальным количеством различных символов.
        String result = maxDiffSymbols(rows);
        System.out.println("Ответ: " + result);
    }

    //отдельный метод для поиска нужной строки
    public static String maxDiffSymbols(String[] array) {
        String result;
        int differentSymbols = 1;
        int[] diffArray = new int[array.length];
        for (int word = 0; word < array.length; word++) {
            differentSymbols = (int) array[word].chars().distinct().count();
            diffArray[word] = differentSymbols;
        }
        //поиск номера строки с максимумом разных символов
        int indexMaxDiff = 0;
        int max = 0;
        for (int j = 0; j < diffArray.length; j++) {
            if (diffArray[j] > max) {
                max = diffArray[j];
                indexMaxDiff = j;
            }
        }
        //Если таких строк будет много, то вывести первую.
        for (int i : diffArray) {
            if (i == max) {
                indexMaxDiff = 0;
                break;
            }
        }
        result = array[indexMaxDiff];
        return result;
    }
}