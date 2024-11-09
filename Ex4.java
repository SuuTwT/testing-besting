import java.util.Scanner;

public class Ex4 {
    public static void main( String[] args){
        System.out.println("Prosty kalkulator");
        System.out.println("---------------------");

        double a = input("Podaj pierwszą liczbę: ");
        String b = inputString("Podaj symbol operacji spośród(+ - * /) : ");
        double c = input("Podaj drugą liczbę: ");

        double result =0;
        result = getResult(b, result, a, c);

        printResult(a, b, c, result);

    }

    private static void printResult(double a, String b, double c, double result) {
        System.out.println("Działanie " + a + " " + b + " " + c + " jest równe " + result);
    }

    private static double getResult(String b, double result, double a, double c) {
        switch(b){
            case "+":
                result = a + c;
                break;
            case "-":
                result = a - c;
                break;
            case "*":
                result = a * c;
                break;
            case "/":
                result = a / c;
                break;
            default:
                System.out.println("Niepoprawny operator.");
                break;
        }
        return result;
    }

    static int input(String message){
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();

    }
    static String inputString(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
