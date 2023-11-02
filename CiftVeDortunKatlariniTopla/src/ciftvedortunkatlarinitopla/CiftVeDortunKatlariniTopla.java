package ciftvedortunkatlarinitopla;
import java.util.Scanner;

public class CiftVeDortunKatlariniTopla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Tek bir sayı girilene kadar girişleri kabul eden program.");
        System.out.println("Girilen değerlerden çift ve 4'ün katları olan sayıları toplar.");

        while (true) {
            System.out.print("Bir sayı girin (Tek sayı girişi için program sonlanır): ");
            int sayi = input.nextInt();

            if (sayi % 2 == 0 || sayi % 4 == 0) {
                toplam += sayi;
            }

            if (sayi % 2 == 1) {
                break; // Tek sayı girildiğinde döngü sonlanır.
            }
        }
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}