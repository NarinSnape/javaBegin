import java.util.Scanner;

public class TaskWork11 {
    public static void main(String[] args) {
        //1. Ввести первое  число с клавиатуры и записать его в строковую переменную:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое  число: ");
        String firstStr = scanner.next();

        //2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int:
        System.out.println("Введите второе число: ");
        int secondNum = scanner.nextInt();
        scanner.close();

        //3. Сравнить 2 числа и вывести большее на экран:
        //включая вариант равенства:
        int firstNum = Integer.parseInt(firstStr);
        int max = Math.max(firstNum, secondNum);
        String message = (firstNum == secondNum ? "Числа равны " : "Большее число: ") + max;
        System.out.println(message);

        //4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double:
        //выводятся только если не равны:
        if (!message.startsWith("Ч")) {
            double min = Math.min(firstNum, secondNum);
            System.out.print("Меньшее число: " + min);
        }
    }
}
