package manavkasaprogrami;
import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        System.out.println("Manav Kasa Programı");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Meyveler ve KG Fiyatları;");
        System.out.println("Armut : 2,14 TL");
        System.out.println("Elma : 3,67 TL");
        System.out.println("Domates : 1,11 TL");
        System.out.println("Muz: 0,95 TL");
        System.out.println("Patlıcan : 5,00 TL");
        
        float armut, elma, domates, muz, patlican, toplam;
        float deger1, deger2, deger3, deger4, deger5;
        System.out.print("Armut Kaç Kilo ? :");
        armut = input.nextFloat();
        deger1 = (float) (armut * 2.14);
        System.out.print("Elma Kaç Kilo ? :");
        elma = input.nextFloat();
        deger2 = (float) (elma * 3.67);
        System.out.print("Domates Kaç Kilo ? :");
        domates = input.nextFloat();
        deger3 = (float) (domates * 1.11);
        System.out.print("Muz Kaç Kilo ? :");
        muz = input.nextFloat();
        deger4 = (float) (muz * 0.95);
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = input.nextFloat();
        deger5 = (float) (patlican * 5.00);
        toplam = deger1 + deger2 + deger3 + deger4 + deger5;
        System.out.println("Toplam Tutar :" + toplam);
        
    }
    
}
