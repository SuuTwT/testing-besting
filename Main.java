import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        System.out.println("Hello World");
//
//        int firstNumber = 5;
//        int secondNumber = 7;
//        int result = firstNumber + secondNumber;
//
//        System.out.println(result);
//
//        double a = 17.2;
//        double b = 56.3;
//        double resultdouble = b / a;
//
//        System.out.println(resultdouble);
//
//        boolean bool1 = true;
//        boolean bool2 = false;
//
//        System.out.println(!(resultdouble == result));
//
//        int lib1 = 12;
//        int lib2 = 7;
//
//        if( lib1 > lib2){
//            System.out.println("Liczba " + lib1 + " jest większa niż liczba " + lib2);
//        } else if(lib1 < lib2) {
//            System.out.println("Liczba " + lib1 + " jest mniejsza niż liczba " + lib2);
//        } else { System.out.println("Liczby są sobie równe");
//
//        }
//
//        for(int i=0; i<10; i++){
//            System.out.print(i+1 + ", ");
//        }
//
//        int i = 0;
//        while (i < 10) {
//            System.out.print(i + ", ");
//            ++i;
//        }
//        System.out.println("Licznik pętli: " +i);

        System.out.print("Podaj liczbę, by sprawdzić czy jest parzysta: ");
        Scanner scanner = new Scanner(System.in);
        int inputnumber = scanner.nextInt();
        scanner.close();

        if(inputnumber == 0){
            System.out.println("Podana liczba jest zerem.");
        } else if(inputnumber%2==0){
            System.out.println("Liczba " + inputnumber + " jest parzysta.");
        } else {
            System.out.println("Liczba " + inputnumber + " jest nieparzysta.");
        }

    }
}