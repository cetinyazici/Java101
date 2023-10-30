package daireninalaninicevresinihesaplama;
import java.util.Scanner;

public class DaireninAlaniniCevresiniHesaplama {
    public static void main(String[] args) {
        System.out.println("Dairenin Alanını ve Çevresini Hesaplama");
        Scanner input = new Scanner(System.in);
        
        int yariCap, merkezAcisi;
        double PI=3.14, alan, alan2, cevre;
        
        System.out.print("Lutfen Dairenin Yarıçapını Giriniz: ");
        yariCap = input.nextInt();
        
        alan = PI * yariCap * yariCap;
        cevre = 2 * PI * yariCap;
        
        System.out.println("Yarıçapı girilen Dairenin;");
        System.out.println("Alanı: " + alan);
        System.out.println("Çevresi: " + cevre);
        
        System.out.println("Lütfen merkez açısının ölçüsünü giriniz: ");
        merkezAcisi = input.nextInt();
        
        alan2 = (PI * (yariCap * yariCap) * merkezAcisi) / 360;
        
        System.out.println("Merkez açısının ölçüsü girilen daire diliminin alanı: " + alan2);
        
    }
    
}
