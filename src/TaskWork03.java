public class TaskWork03 {
    public static void main(String[] args) {
        //Выполните следующие действия с массивом:
        //1. Задайте массив из 5 любых целых чисел.
        int[] array = {5, 1, 6, 7, 9};
        //2. Поменяйте местами первый и последний элемент в массиве.
        int stakan = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = stakan;
        //3. Вывести в консоль результат суммы первого и среднего элемента.
        System.out.println(array[0]+array[array.length/2]);
    }
}