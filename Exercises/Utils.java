package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static void main(String[] args){


    }
    static int input(String message){
        try {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Podano błędną wartość");
            return 0;
        }
    }

     int inputobject(String message){
        try {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Podano błędną wartość");
            return 0;
        }
    }

}
