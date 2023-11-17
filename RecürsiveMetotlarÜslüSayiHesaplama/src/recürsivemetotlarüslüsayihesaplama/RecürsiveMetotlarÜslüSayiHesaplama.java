package recürsivemetotlarüslüsayihesaplama;
import java.util.Scanner;
public class RecürsiveMetotlarÜslüSayiHesaplama {

    static int  Power(int taban,int üs) 
    {
        int result=1;
        for(int i=1; i<=üs; i++)
        {
            result*=taban;          
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Recursive Metotlar ile Üslü Sayı Hesaplama");
        
        Scanner input = new Scanner(System.in);
        

        System.out.print("Taban değeri giriniz :");
        int taban = input.nextInt();
        
        System.out.print("Üs değerini giriniz :");
        int üs = input.nextInt();
             
        System.out.println(Power(taban,üs));
        
    } 
    
}
