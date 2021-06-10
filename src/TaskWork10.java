import java.util.Scanner;

public class TaskWork10 {
    public static void main(String[] args) {
        //Пользователь задает размерность матрицы:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа, обозначающие размерность матрицы: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double[][] matrix = new double[x][y];

        //Пользователь вводит данные с клавиатуры в матрицу:
        System.out.println("Введите данные для матрицы: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        //Вывод первой строки матрицы на экран, где каждый элемент умножается на 3:
        double multi = 0;
        for (int j = 0; j < y; j++) {
            multi = matrix[0][j] * 3;
            System.out.print(multi + " ");
        }
    }
}
