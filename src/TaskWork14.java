public class TaskWork14 {
    //Task: Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
    //метод для рандомизации в заданном диапазоне
    public static double getRandomIntegerBetweenRange(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }
    public static void main(String[] args) {
        int[] randomArray = new int[15];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) getRandomIntegerBetweenRange(-20, 20);
            System.out.println(randomArray[i]);
        }
        //1. Выведите максимальный и минимальный элемент массива:
        int max, min;
        max = min = randomArray[0];
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
            }
            if (randomArray[i] < min) {
                min = randomArray[i];
            }
        }
        System.out.println("----------------\nmax = " + max + "; min = " + min);
        //2. Из максимального и минимального значения выведите наибольшее по модулю:
        int totalMax = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю: " + totalMax);
    }
}
