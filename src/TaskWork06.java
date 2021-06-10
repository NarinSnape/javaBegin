import java.util.Scanner;

public class TaskWork06 {
    public static void main(String[] args) {
        //Напишите программу-конвертер физических величин:

        //1. Пользователю предлагается на выбор ввести массу или расстояние:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите, что переводить: 1 - масса, 2 - расстояние: ");
        int objectToConvert = scanner.nextInt();

        //2. Пользователю предлагается выбрать единицу измерения:
        if (objectToConvert == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - стоун, 4 - унция");
        } else {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        }
        int units = scanner.nextInt();

        //3. Пользователю предлагается ввести количество выбранных единиц:
        System.out.println("Введите число");
        double amount = scanner.nextDouble();
        scanner.close();

        //4. Вывод результата:"
        double[] result = new double[4];
        switch (objectToConvert) {
            case 1:
                switch (units) {
                    case 1: //выбраны килограммы
                        result[0] = amount; //килограммы
                        result[1] = amount * 2.204623; //фунты
                        result[2] = amount * 0.157473; //стоуны
                        result[3] = amount * 35.27396; //унции
                        break;
                    case 2: //выбраны фунты
                        result[0] = amount * 0.453592; //килограммы
                        result[1] = amount; //фунты
                        result[2] = amount * 0.071429; //стоуны
                        result[3] = amount * 16; //унции
                        break;
                    case 3: //выбраны стоуны
                        result[0] = amount * 6.350293; //килограммы
                        result[1] = amount * 14; //фунты
                        result[2] = amount; //стоуны
                        result[3] = amount * 224; //унции
                        break;
                    case 4: //выбраны унции
                        result[0] = amount * 0.02835; //килограммы
                        result[1] = amount * 0.0625; //фунты
                        result[2] = amount * 0.004464; //стоуны
                        result[3] = amount; //унции
                        break;
                }
                System.out.println("  Результат:\n" +
                        "                > Килограммы: " + result[0] + "\n" +
                        "                > Фунты: " + result[1] + "\n" +
                        "                > Унции: " + result[2] + "\n" +
                        "                > Стоуны: " + result[3] + "\n");
                break;
            case 2:
                switch (units) {
                    case 1: //выбраны метры
                        result[0] = amount; //метры
                        result[1] = amount * 0.000621; //мили
                        result[2] = amount * 1.093613; //ярды
                        result[3] = amount * 3.28084; //футы
                        break;
                    case 2: //выбраны мили
                        result[0] = amount * 1609.344; //метры
                        result[1] = amount; //мили
                        result[2] = amount * 1760; //ярды
                        result[3] = amount * 5280; //футы
                        break;
                    case 3: //выбраны ярды
                        result[0] = amount * 0.9144; //метры
                        result[1] = amount * 0.000568; //мили
                        result[2] = amount; //ярды
                        result[3] = amount * 3; //футы
                        break;
                    case 4: //выбраны футы
                        result[0] = amount * 0.3048; //метры
                        result[1] = amount * 0.000189; //мили
                        result[2] = amount * 0.333333; //ярды
                        result[3] = amount; //футы
                        break;
                }
                System.out.println("  Результат:\n" +
                        "                > Метры: " + result[0] + "\n" +
                        "                > Мили: " + result[1] + "\n" +
                        "                > Ярды: " + result[2] + "\n" +
                        "                > Футы: " + result[3] + "\n");
                break;
        }
    }
}
