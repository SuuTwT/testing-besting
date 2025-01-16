package Exercises;

public class Classes {
    public static void main(String[] args){

        int a = Utils.input("Podaj pierwszą liczbę: ");
        int b = Utils.input("Podaj drugą liczbę: ");
        int c = Utils.input("Podaj trzecią liczbę: ");

        int min = getMin(a, b, c);;
        int max = getMax(a, b, c);;

        printResult(a, b, c, max, min);


    }

    private static void printResult(int a, int b, int c, int max, int min) {
        System.out.println("Spośród podanych liczb: " + a + ", " + b + ", " + c + ", największa z nich to " + max + ", a najmniejsza to " + min);
    }

    private static int getMin(int a, int b, int c) {
        int min;
        if( a < b && a < c){
            min = a;
        } else if( b < a && b < c){
            min = b;
        } else {
            min = c;
        }
        return min;
    }

    private static int getMax(int a, int b, int c) {
        int max;
        if( a > b && a > c) {
            max = a;
        } else if( b > a && b > c){
            max = b;
        } else {
            max = c;
        }
        return max;
    }

}
