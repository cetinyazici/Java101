package sayilaribüyüktenkücügesiralama;
import java.util.Scanner;

public class SayilariBüyüktenKücügeSiralama {

    public static void main(String[] args) {
        System.out.println("Sayıları Küçten Büyüğe Sıralama");
        Scanner input = new Scanner(System.in);
        
        int number1, number2, number3;
        System.out.print("Birinci sayi: ");
        number1 = input.nextInt();       
        System.out.print("İkinci sayi: ");
        number2 = input.nextInt();     
        System.out.print("Üçüncü sayi: ");
        number3 = input.nextInt();
        
        if (number1 <= number2 && number1 <= number3) {
            if (number2 <= number3) {
                System.out.println(number1 + " <= " + number2 + " <= " + number3);
            } else {
                System.out.println(number1 + " <= " + number3 + " <= " + number2);
            }
        } else if (number2 <= number1 && number2 <= number3) {
            if (number1 <= number3) {
                System.out.println(number2 + " <= " + number1 + " <= " + number3);
            } else {
                System.out.println(number2 + " <= " + number3 + " <= " + number1);
            }
        } else {
            if (number1 <= number2) {
                System.out.println(number3 + " <= " + number1 + " <= " + number2);
            } else {
                System.out.println(number3 + " <= " + number2 + " <= " + number1);
            }
        }
    }
    
}
