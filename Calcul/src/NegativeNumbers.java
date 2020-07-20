import java.util.ArrayList;

public class NegativeNumbers {
    public static void Minus(String s, ArrayList num) {
        for (String a : s.split("\\W")) {           // Разделение строки по нечисловым значениям
            num.add(a);                                   // Добавление значений в массив num
        }
        try {
            if (num.size() > 4) {                         //Проверка на количество операндов
                throw new Exception("Число должно быть положительным");
            }                                            //Исключение на отрицательные числа
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }



    }
}
