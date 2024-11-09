import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj A:");
        int a = userInput.nextInt();

        System.out.print("Podaj B:");
        int b = userInput.nextInt();
        userInput.close();

        if(a >= b){
            System.out.println("Liczba A powinna być mniejsza niż B.");
        }else {
            int result = 0;
            int resultw = 0;
            for(int i = a; i<=b; i++){
                result +=i;
            }
            int i = a;
            while(i<=b){
                resultw +=i;
                i++;
            }

            int x = a;
            int resultdw = 0;
            do{
                resultdw +=x;
                x++;
            }
            while(x<=b);

            System.out.println(result + ", " + resultw + ", " + resultdw);
        }
    }
}
