package palindromsayilar;
import java.util.Scanner;
public class PalindromSayilar {
        static boolean isPolidrom(int number)
        {
            int temp=number;
            int reverseNumber=0;
            int lastNumber;
            while(temp!=0)
            {
                lastNumber=temp%10;//son basamak bulunur.
                reverseNumber=(reverseNumber*10)+lastNumber;//sayıyı ter çevirme işlemi yapılır.
                temp/=10;
            }
            if(number==reverseNumber)
            {
                System.out.println("Polidrom sayıdır....");
            }
            else
            {
                System.out.println("Polidrom sayı değildir....");
            }    
            return true;             
        }
    public static void main(String[] args) {
        System.out.println("Palindrom Sayılar");
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Lutfen sayi giriniz: ");
        number = input.nextInt();
        isPolidrom(number);
        
    }
    
}
