import java.util.Scanner;

public class TaskWork09 {
    public static void main(String[] args) {
        //1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arrayLength = scanner.nextInt();
        double[] justArray = new double[arrayLength];
        System.out.println("Введите данные для массива: ");
        for (int i = 0; i < arrayLength; i++) {
            justArray[i] = scanner.nextDouble();
        }
        scanner.close();

        //2. Посчитайте среднее арифметическое элементов массива.
        double avgArray = 0;
        for (int i = 0; i < arrayLength; i++) {
            avgArray += justArray[i];
        }
        avgArray /= arrayLength;

        //3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (int i = 0; i < arrayLength; i++) {
            double toPrint = justArray[i] * avgArray;
            System.out.println(toPrint);
        }
    }
}