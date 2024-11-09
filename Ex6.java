import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        System.out.println("Kalkulator Podatkowy");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj swój dochód: ");
        double income = userInput.nextDouble();
        userInput.close();

        double tax=0;
        double result=0;

        if(income <= 85528){
            tax = income*0.18-556.02;
            result = income - tax;
            System.out.println("Podatek: " + (tax<0 ? 0 : tax) + "zł");
        }else{
            tax = (income-83528) * 0.32 + 14839;
            result = income - tax;
            System.out.println("Podatek: " + (tax<0 ? 0 : tax) + "zł");
        }
    }
}
