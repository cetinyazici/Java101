package dizidekielemanlarikbsiralama;
import java.util.Scanner;
import java.util.Arrays;
public class DizidekiElemanlariKBSiralama {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz :");
        int n = input.nextInt();
        
        int[] dizi = new int[n];
            
        
        System.out.println("Dizinin elemanlarını giriniz :  ");
        for(int i=0; i<n; i++)
        {
            System.out.print((i+1)+". Elamanı: ");
            dizi[i]=input.nextInt();
        }
        
        Arrays.sort(dizi);
        
        System.out.print("Sıralama: ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
    
}
