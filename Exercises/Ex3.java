package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main( String[] args){
        System.out.println("Kalkulator Rat w sklepie AGD");

        double cena = InputDouble("Podaj cenę towaru: ");
        double raty = InputDouble("Podaj liczbę rat: ");
        printSeparator();

        if(isParameterInvalid(cena, raty)) {
            showError();
        } else {
            CalculateAndShowResult(cena, raty);
        }
    }

    private static boolean isParameterInvalid(double cena, double raty) {
        return cena < 100 || cena > 10000 || raty < 6 || raty > 48;
    }

    private static void CalculateAndShowResult(double cena, double raty) {
        double odsetki = cena * getProcent(raty);
        double suma = cena + odsetki;

        double wynik = suma / raty;
        System.out.println("Cena towaru: " + cena + "zł");
        System.out.println("Liczba rat: " + raty + "msc.");
        printSeparator();
        System.out.println("Odsetki: " + odsetki + "zł");
        System.out.println("Łączny koszt: " + suma + "zł");
        System.out.println("Miesięczna rata, wraz z odsetkami wynosi: " + wynik + "zł");
    }

    private static void printSeparator() {
        System.out.println("-------------------------");
    }

    private static void showError() {
        System.out.println("Kwota powinna znajdować się w przedziale od 100zł do 10 000zł");
        System.out.println("Rata powinna znajdować się w przedziale od 6 do 48");
    }

    private static double getProcent(double raty) {
        if (raty <= 12) {
            return 0.025;
        } else if (raty <= 24) {
            return 0.05;
        } else {
            return 0.1;
        }
    }

    static double InputDouble(String message) {
        try {
            System.out.println(message);
            Scanner InputDouble = new Scanner(System.in);
            return InputDouble.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Podano błędną wartość.");
            return 0;
        }
    }

}
