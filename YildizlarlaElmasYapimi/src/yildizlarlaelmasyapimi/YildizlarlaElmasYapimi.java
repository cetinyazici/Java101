package yildizlarlaelmasyapimi;
import java.util.Scanner;

public class YildizlarlaElmasYapimi {
    public static void main(String[] args) {
        System.out.println("Yıldızlarla Elmas Yapımı");
        Scanner input = new Scanner(System.in);
               
        System.out.print("Yıldız sayısını giriniz: ");
        int number = input.nextInt();

        // Üst kısım
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısım
        for (int i = number - 2; i >= 0; i--) {
            for (int j = 0; j < (number - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}
