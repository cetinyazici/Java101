package basamaksayilarinintoplaminihesaplama;
import java.util.Scanner;

public class BasamakSayilarininToplaminiHesaplama {

    public static void main(String[] args) {
        System.out.println("Basamak Sayilarinin Toplamini Hesaplayan Program");
        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0        
        Scanner input = new Scanner(System.in);
        int number, numberCounter=0, total=0, tempNumber, basamakDegeri;
        System.out.print("Lutfen bir sayi giriniz: ");
        number = input.nextInt();
        tempNumber = number;
        while(tempNumber!=0)
        {
            tempNumber = tempNumber / 10; 
            numberCounter++;
        }       
        System.out.println("Basamak Sayisi: "+ numberCounter);
        
        tempNumber = number;
        while(tempNumber!=0)
        {
            basamakDegeri=tempNumber%10;
            total += basamakDegeri;
            tempNumber = tempNumber / 10;   
        }
        System.out.println("Basamak Sayiların Toplmaı: "+ total);
        
    }  
}

