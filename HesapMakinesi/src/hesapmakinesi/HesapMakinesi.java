package hesapmakinesi;
import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        
        System.out.println("Hesap Makinesi");
        Scanner input = new Scanner(System.in);
        
        int sayi1, sayi2, secim;
        
        System.out.print("Lutfen birinci sayıyı giriniz: ");
        sayi1 = input.nextInt();
        
        System.out.print("Lutfen ikinci sayıyı giriniz: ");
        sayi2 = input.nextInt();
        
        System.out.print("Lutfen yapacağınız işlemi (1: '+'  2: '-'  3: '*'  4: '/') giriniz: ");
        secim = input.nextInt();
        
        switch(secim)
        {
            case 1 -> {
                int toplam = sayi1 + sayi2;
                System.out.println("Toplamı: " + toplam);
            }
            case 2 -> {
                int cıkarma = sayi1 - sayi2;
                System.out.println("Çıkarımı: " + cıkarma);
            }
            case 3 -> {
                int carpim = sayi1 * sayi2;
                System.out.println("Çarpımı: " + carpim);
            }
            case 4 -> {
                int bölüm = sayi1 / sayi2;
                System.out.println("Bölümü: "+ bölüm);
            }
            default -> System.out.println("Yanlış Seçim yapıldı....");
        }
        
    }
    
}
