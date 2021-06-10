import java.util.Scanner;

public class TaskWork08 {
    public static void main(String[] args) {
        //Пользователь вводит любое целое положительное число n.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int n = scanner.nextInt();
        scanner.close();

        //Программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        int sum = 0;
        for (; n > 0; n--) {
            if (n % 2 != 0) {
                sum += n;
            }
        }
        System.out.println("Сумма всех нечетных чисел от 1 до n: " + sum);

    }
}