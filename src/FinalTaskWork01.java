import java.util.Scanner;

public class FinalTaskWork01 {
    public static void main(String[] args) {
        //Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
        //Пользователь вводит текущий курс и количество рублей:
        Scanner scanner = new Scanner(System.in);
        System.out.println(">Текущий курс: ");
        double dollarsRate = scanner.nextDouble();
        System.out.println(">Количество рублей: ");
        double roublesAmount = scanner.nextDouble();
        scanner.close();

        //Итоговое значение должно быть округлено до двух знаков после запятой:
        double dollarsAmount = roublesAmount / dollarsRate;
        System.out.println(">Итого: " + String.format("%.2f", dollarsAmount) + " долларов");
    }
}