import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();                       //чтение строки

            try {
                if (s.contains(".")) {
                    throw new Exception("Число должно целым");
                }                                               // Исключение на дробные  числа
            } catch (Exception e) {
                System.out.println("Число должно целым");
                main(args);
            }


            ArrayList<String> negative = new ArrayList<>();      //Создания массива, для исключения отрицательных чисел
            ArrayList<String> strings = new ArrayList<>();       // Создание массива для хранение чисел

            for (String a : s.split("\\D")) {            // Разделение строки по числовым значениям
                strings.add(a);                                // Добавление значений в массив strings
            }


            RomeNumber sc = new RomeNumber();                 //Создание объекта, для использования Римских чисел
            NegativeNumbers min = new NegativeNumbers();                          //Создание объекта для исключение отрицательных чисел

            if (strings.size() < 1) {                         //Проверка на Римские числа
                sc.SplitRome(strings, s);                     //Запуск Римского подсчета
                main(args);                                   //Возврат к началу программы
            }


            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).isEmpty()) {
                    strings.remove(i);                        // Удаление пробелов из массива с числами
                    i = 0;
                }
            }

            try {
                if (strings.size() < 2 || strings.get(0).equals("")) {
                    throw new Exception("Необходимо использовать числа одного типа");

                }                                            //Исключения на использовнаие чисел одного типа
            } catch (Exception e) {
                System.out.println("Необходимо использовать числа одного типа");
                main(args);
            }
            min.Minus(s, negative);                           //Исключение отрицательных чисел

            int x = Integer.parseInt(strings.get(0));        // Перевод строк массива strings в числа
            int y = Integer.parseInt(strings.get(1));

            try {
                if (x < 1 || x > 10 || y < 1 || y > 10) {
                    throw new Exception("Число должно быть в диапозоне от 1 до 10");
                }
            } catch (Exception e) {
                e.printStackTrace();                         // Исключению на диапозон 1 -10
                System.exit(0);
            }


            Operation op = new Operation();                 //Создание объекта для вычисления
            op.Oper(x, y, s);                               //Вычисление


        }

    }

}