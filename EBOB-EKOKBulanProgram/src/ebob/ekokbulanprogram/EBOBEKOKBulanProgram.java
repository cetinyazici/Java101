package ebob.ekokbulanprogram;
import java.util.Scanner;
public class EBOBEKOKBulanProgram {

    public static void main(String[] args) {
        System.out.println("EBOB-EKOK Bulan Program");
        Scanner input = new Scanner(System.in);
        int ekok;
        int ebob=1;
        
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        
        System.out.print("n2 degerini giriniz: ");
        int n2 = input.nextInt();
        
        int i=1;
        while(i<=n1)
        {
            if(n1%i==0 && n2%i==0)
            {
                ebob=i;
                
            }
            i++;     
        }
        System.out.println("EBOB: "+ebob);
        
        while(i<=(n1*n2))
        {
            if(i%n1==0 && i%n2==0)
            {
                System.out.println("EKOK: "+i);
                break;
            }
            i++;
        }
        
        ekok = (n1*n2)/ebob;
        System.out.println("Formüle göre ekok: "+ekok);
        
    }
}
