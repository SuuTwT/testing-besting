import java.util.Scanner;

public class Ex4 {
    public static void main( String[] args){
        System.out.println("Prosty kalkulator");
        System.out.println("---------------------");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę:");
        double a = userInput.nextDouble();

        System.out.print("Podaj symbol operacji spośród(+ - * /) :");
        String b = userInput.next();

        System.out.print("Podaj drugą liczbę:");
        double c = userInput.nextDouble();
        userInput.close();

        double result = 0;

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

        System.out.println("Działanie " + a + " " + b + " " + c + " jest równe " + result);
    }
}
