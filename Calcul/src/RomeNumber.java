import java.util.ArrayList;

public class RomeNumber {

    public static void SplitRome(ArrayList<String> strings, String s){
        for (String a : s.split("\\s"))
                strings.add(a);                               //Разделение по пробелам
        int a1 = Rome(strings.get(0));
        int b1 = Rome(strings.get(2));                        //Форматирование в int



        OperationRomeNumbers op = new OperationRomeNumbers();
        ResultRomeOperation result = new ResultRomeOperation();
        int a = op.OperationRome(a1, b1, s);                    //Вычисление результата
        result.Result(a);                                       //Вывод результата в римских числах




    }

    private static int Rome(String a) {                          //Форматирование в int
        if (a.equals("I")){
            return 1;
        }
        if (a.equals("II")) {
            return 2;
        }
        if (a.equals("III")) {
            return 3;
        }
        if (a.equals("IV")) {
            return 4;
        }
        if (a.equals("V")) {
            return 5;
        }
        if (a.equals("VI")) {
            return 6;
        }
        if (a.equals("VII")) {
            return 7;
        }
        if (a.equals("VIII")) {
            return 8;
        }
        if (a.equals("IX")) {
            return 9;
        }
        if (a.equals("X")) {
            return 10;
        }
        else
            System.out.println("Число должно быть в диапозоне от I до X");
        System.exit(0);
        return 0;
    }


}
