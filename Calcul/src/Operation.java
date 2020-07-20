public class Operation {

    public static void Oper(int a1, int b1, String s) {

        double x1 = (double) (a1);
        double y1 = (double) (b1);                                   // Для корректного отображения дробных результатов
        double d = x1 / y1;


        if (s.contains("+"))
            System.out.println(a1 + b1);

        if (s.contains("-")) {
            System.out.println(a1 - b1);
        }
        if (s.contains("/"))
            if (d % 2 != 1 && d % 2 != 0) {
                System.out.println(x1 / y1);                        // Отдельный вывод для дробнеых результ.
            } else {
                System.out.println(a1 / b1);
            }
        if (s.contains("*")) {
            System.out.println(a1 * b1);
        }
    }
}
