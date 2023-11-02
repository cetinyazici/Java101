package uc_dörttambölünenlerinortalmasi;
import java.util.Scanner;

public class Uc_DörtTamBölünenlerinOrtalmasi {

    public static void main(String[] args) {
        System.out.println("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        int number = input.nextInt();
        
        int toplam=0;
        int adet=0;
        
        for(int i=0; i<=number; i++)
        {
            if(i%3==0 || i%4==0)
            {
                toplam=toplam+i;
                adet++;
            }            
        }
        
        if (adet > 0) 
        {
            double ortalama = toplam / adet;
            System.out.println("0'dan " + number + " kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } 
        else 
        {
            System.out.println("Bu aralıkta 3 ve 4'e tam bölünen herhangi bir sayı bulunamadı.");
        }

    }   
}
