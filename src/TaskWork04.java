import java.util.Scanner;
public class TaskWork04 {
    public static void main(String[] args) {
        //Написать программу, которая будет выполнять следующие действия:

        //1. Ввести три числа с клавиатуры x, y, z
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x, y и z: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        //2. Найти и вывести в консоль среднее арифметическое этих чисел.
        double avg = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + avg);

        //3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        avg /= 2;
        avg = Math.floor(avg);

        //4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (avg > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}