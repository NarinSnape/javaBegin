import java.util.Scanner;

public class TaskWork07 {
    public static void main(String[] args) {
        //Напишите программу:

        //1. Пользователь вводит размер массива и данные с клавиатуры в массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arrayLength = scanner.nextInt();
        double[] arrayOfConstants = new double[arrayLength];
        System.out.println("Введите константы: ");
        for (int i = 0; i < arrayLength; i++) {
            arrayOfConstants[i] = scanner.nextDouble();
        }
        scanner.close();

        //заранее заданные константы:
        double x = 3.1415;
        double y = 7.666;
        double z = 1;

        //2. Сравнить элементы массива с заранее заданными константами x, y, z:
        for (int i = 0; i < arrayLength; i++) {
            if (arrayOfConstants[i] == x || arrayOfConstants[i] == y || arrayOfConstants[i] == z) {
                //3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}

