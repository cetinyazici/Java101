package tersucgencizme;
import java.util.Scanner;
public class TersUcgenCizme {

    public static void main(String[] args) {
        System.out.println("Ters üçgen çizme");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Basamak sayısnı giriniz: ");
        int number = input.nextInt();
        
        for (int i=number-3; i>=0; i--)
        {
            for (int j=0; j<(number - i - 1); j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
