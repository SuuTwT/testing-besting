package Exercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        System.out.println("Podaj 3 liczby, by uporządkować je względem wielkości");
        System.out.print("Podaj pierwszą liczbę:");
        Scanner userInput = new Scanner(System.in);
        int a = userInput.nextInt();
        int max = a;
        int min = a;

        System.out.print("Podaj drugą liczbę:");
        int b = userInput.nextInt();
        if(b>max) {
            max = b;
        }
        if(b<min) {
            min = b;
        }

        System.out.print("Podaj trzecią liczbę:");
        int c = userInput.nextInt();
        userInput.close();
        if(c>max){
            max = c;
        }
        if(c<min){
            min = c;
        }

        System.out.println("Spośród podanych liczb: " + a + ", " + b + ", " + c + ", największa z nich to " + max + ", a najmniejsza to " + min);


    }
}
