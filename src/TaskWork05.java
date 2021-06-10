import java.util.Scanner;

public class TaskWork05 {
    public static void main(String[] args) {
        //Напишите простой калькулятор:

        //1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа и знак операции (‘+’, ‘-’, ‘*’ или ‘/’): ");
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        String calc = scanner.next();
        scanner.close();
        //2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        double result = 0;
        switch (calc) {
            case "+":
                result = x + y;
                System.out.println("Результат операции: " + result);
                break;
            case "-":
                result = x - y;
                System.out.println("Результат операции: " + result);
                break;
            case "*":
                result = x * y;
                System.out.println("Результат операции: " + result);
                break;
            case "/":
                if (y != 0) {
                    result = x / y;
                    System.out.println("Результат операции: " + result);
                } else {
                    System.out.println("На 0 делить нельзя.");
                }
                break;
            default:
                System.out.println("Что-то пошло не так.");
                break;
        }
    }
}