package dortvebesinkuvvetleriniyazdirma;
import java.util.Scanner;
public class DortVeBesinKuvvetleriniYazdirma {

    public static void main(String[] args) {
        System.out.println("Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdırma");
        
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Sayi giriniz: ");
        number = input.nextInt();
        
        System.out.println("Dördün Katları: ");
        for(int i=1; i<=number; i=i*4)
        {
            System.out.println(i);
        }
             
        System.out.println("Beşin Katları: ");
        for(int i=1; i<=number; i*=5)
        {
            System.out.println(i);
        }
    }
    
}
