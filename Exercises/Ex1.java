package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Program konwersji stopni Celsjusza na stopnie Fahrenheita");

        boolean done = false;
        while(!done) {
            try {
                Scanner userInput = new Scanner(System.in);
                System.out.print("Podaj wartość temperatury w stopniach Celsjusza:");
                double temp = userInput.nextDouble();
                userInput.close();

                double fahr = 1.8 * temp + 32.0;

                System.out.println("Podana temperatura: " + temp + "°C, po konwersji odpowiada " + fahr + "°F.");
                done = true;
            }
            catch(InputMismatchException Exception){
                System.out.println("Proszę podać wartość liczbową.");
            }
        }
    }
}
