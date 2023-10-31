package havasicakliginagöreetkinlikonerme;
import java.util.Scanner;

public class HavaSicakliginaGöreEtkinlikOnerme {

    public static void main(String[] args) {
        System.out.println("Hava Sıcaklığına Göre Etkinlik Önerme");
        Scanner input = new Scanner(System.in);
        
        int sicaklik;
        System.out.print("Lutfen sıcaklık degerini giriniz: ");
        sicaklik = input.nextInt();
        
        if(sicaklik<5)
        {
            System.out.println("Kayak yapabilrsin...");
        }
        else if(sicaklik>5 && sicaklik<15)
        {
            System.out.println("Sinema İzleyebilrsin...");
        }
        else if(sicaklik>15 && sicaklik<25)
        {
            System.out.println("Piknik Yapabilrisin..");
        }
        else if(sicaklik>25)
        {
            System.out.println("Yüzme Yapabirisin..");
        }        
    } 
}
