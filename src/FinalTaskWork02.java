import java.util.Scanner;

public class FinalTaskWork02 {
    public static void main(String[] args) {
        //Напишите программу, которая позволит решить простое уравнение относительно x:
        Scanner scanner = new Scanner(System.in);
        //Возможность завершить работу программы:
        System.out.println(">Введите q для выхода.");
        for (; ; ) {
            //Программа принимает на вход строку длиной 5 символов:
            System.out.println(">Введите простое уравнение: \n (например, x+5=7)");
            String equation = scanner.nextLine();
            if (equation.equals("q")) {
                scanner.close();
                System.exit(0);
            } else {
                //Нужно найти неизвестное:
                String result = solver(equation);
                System.out.println(">x is " + result);
            }
        }
    }

    // метод для вычислений:
    public static String solver(String equation) {
        int searchX, x, y, z;
        String result = "missing";
        searchX = equation.indexOf("x");
        String operand = equation.substring(1, 2);
        switch (operand) {
            case "+":
                if (searchX == 0) {
                    y = Integer.parseInt(equation.substring(2, 3));
                    z = Integer.parseInt(equation.substring(4, 5));
                    result = Integer.toString(z - y);
                    break;
                } else if (searchX == 2) {
                    x = Integer.parseInt(equation.substring(0, 1));
                    z = Integer.parseInt(equation.substring(4, 5));
                    result = Integer.toString(z - x);
                    break;
                } else if (searchX == 4) {
                    x = Integer.parseInt(equation.substring(0, 1));
                    y = Integer.parseInt(equation.substring(2, 3));
                    result = Integer.toString(x + y);
                    break;
                } else {
                    break;
                }
            case "-":
                if (searchX == 0) {
                    y = Integer.parseInt(equation.substring(2, 3));
                    z = Integer.parseInt(equation.substring(4, 5));
                    result = Integer.toString( y + z);
                    break;
                } else if (searchX == 2) {
                    x = Integer.parseInt(equation.substring(0, 1));
                    z = Integer.parseInt(equation.substring(4, 5));
                    result = Integer.toString( x - z);
                    break;
                } else if (searchX == 4) {
                    x = Integer.parseInt(equation.substring(0, 1));
                    y = Integer.parseInt(equation.substring(2, 3));
                    result = Integer.toString( x - y);
                    break;
                } else {
                    break;
                }
            default:
                throw new IllegalStateException(operand + " - это что за покемон? ");
        }
        return result;
    }
}