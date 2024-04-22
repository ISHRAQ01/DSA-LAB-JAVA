// class Calculators{
//     public static void add(int a,int b){
//         System.out.println(a+b);
//     }
// }
// class Casio extends Calculators{
//     public static void add(int a,int b){
//         System.out.println("sum "+(a+b));
//     }
// }
public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator() {
            public static int add(int a, int b) {
                return a + b;
            }

            // Any additional methods or fields needed by the anonymous class
            // can be defined here.
        };

        int r = c.add(5, 9);
        System.out.println("SUM IS= " + r);
    }
}