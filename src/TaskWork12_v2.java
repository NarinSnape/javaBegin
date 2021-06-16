public class TaskWork12_v2 {
    public static void main(String[] args) {
        //Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
        //1. Проверить, содержит ли строка подстроку “Java” (используйте contains()):
        //2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()):
        //3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()):
        String str = "I like Java!!!";
        boolean itsOK = false;
        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            itsOK = true;
        }

        //4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру:
        if (itsOK) {
            System.out.println(str.toUpperCase());
        }
        //5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()):
        str = str.replace('a', 'o').substring(7, 11);
        System.out.println(str);
    }
}
