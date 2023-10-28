package taksimetreprogrami;

import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double KM, hesapla, KMdeger=2.20;
        int taksimetreAcilis=10;
        
        System.out.print("Lütfen Gidilen KM yi Yazınız: ");
        KM = input.nextDouble();
        
        hesapla = KM*KMdeger + taksimetreAcilis ;
        
        if(hesapla<=20)
        {
            int tutar=20;
            System.out.println("Ödenecek Tutar: "+tutar);
        }
        else
            System.out.println("Ödenecek Tutar: "+hesapla);
    }    
}
