package üslüsayihesaplayanprogram;
import java.util.Scanner;
public class ÜslüSayiHesaplayanProgram {

    public static void main(String[] args) {
        System.out.println("Üslü Sayi Hesaplayan Program");
        Scanner input = new Scanner(System.in);
        
        int number, üssü, total=1;
        System.out.print("Lutfen bir sayi griniz: ");
        number = input.nextInt();
        
        //3^4=3*3*3*3 demektir.
        System.out.print("Lutfen almak istediğiniz üssü giriniz: ");
        üssü = input.nextInt();
        
        for(int i=1; i<=üssü; i++)
        {
            total *= number;
        }
        
        System.out.println("Sonuc: "+ total);
    }
}
