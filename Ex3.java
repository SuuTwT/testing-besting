import java.util.Scanner;

public class Ex3 {
    public static void main( String[] args){
        System.out.println("Kalkulator Rat w sklepie AGD");

        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj cenę towaru:");
        double cena = userInput.nextDouble();

        System.out.print("Podaj liczbę rat:");
        double raty = userInput.nextDouble();

        double procent;

        if( raty >= 6 && raty <= 12){
            procent = 0.025;
        }else if( raty >= 13 && raty <= 24){
            procent = 0.05;
        }else {
            procent = 0.1;
        }
        double odsetki = cena * procent;
        double suma = cena + odsetki;

        double wynik = suma/raty;
        System.out.println("Cena towaru: " + cena + "zł");
        System.out.println("Liczba rat: " + raty + "msc.");
        System.out.println("----------------");
        System.out.println("Odsetki: " + odsetki + "zł");
        System.out.println("Łączny koszt: " + suma + "zł");
        System.out.println("Miesięczna rata, wraz z odsetkami wynosi: " + wynik + "zł");

    }

}
