package kdvtutarıhesaplama;
import java.util.Scanner;

public class KDVTutarıHesaplama {
    public static void main(String[] args) {
        System.out.println("KDV Tutarı Hesaplayan Program");
        Scanner input = new Scanner(System.in);
        double para, hesapla;
        
        System.out.print("Lütfen para değerini giriniz: ");
        para = input.nextDouble();
        
        if(para>=0 && para<=1000)
        {
            double KDV = 0.18;
            hesapla = para * (1 + KDV);
            System.out.println("KDV'siz Fiyat: "+ para);
            System.out.println("KDV'li Fiyat: "+hesapla);
            System.out.println("KDV tutarı: "+ KDV);
        }
        else
        {
            double KDV = 0.08;
            hesapla = para * (1 + KDV);
            System.out.println("KDV'siz Fiyat: "+ para);
            System.out.println("KDV'li Fiyat: "+hesapla);
            System.out.println("KDV tutarı: "+ KDV);
        }
    }
    
}
