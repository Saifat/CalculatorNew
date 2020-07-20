public class OperationRomeNumbers {
    public static int OperationRome(int a1, int b1, String s) {

        if (s.contains("+")) {
            return (a1 + b1);
        }
        else if (s.contains("-")) {
            return  (a1 - b1);
        }
        else if (s.contains("/")) {
            return (a1 / b1);
            }
       else if (s.contains("*")) {
            return (a1 * b1);
        }
        else
            return 0;
    }
}
