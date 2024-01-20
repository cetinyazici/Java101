package dizidekielemanlarinfrekansi;
import java.util.Arrays;
public class DizidekiElemanlarinFrekansi {

    public static void main(String[] args) {
        
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] dizi2 = {12,12,23,23,56,5,4,54,45,56};
        
        System.out.println("Dizi: "+Arrays.toString(dizi));
        
        System.out.println("Tekrar Sayıları: ");
        
        for (int i = 0; i < dizi.length; i++) 
        {
            int sayac = 1;
            if (dizi[i] != -1) 
            {
                for (int j = i + 1; j < dizi.length; j++) 
                {
                    if (dizi[i] == dizi[j]) 
                    {
                        sayac++;
                        dizi[j] = -1; 
                    }
                }
                System.out.println(dizi[i] + " sayısı " + sayac + " kere tekrar edildi.");
            }
        }
        
        System.out.println("-----------------------------------");
        System.out.println("Dizi: "+Arrays.toString(dizi2));
        
        for (int i = 0; i < dizi2.length; i++) 
        {
            int sayac = 1;
            if (dizi2[i] != -1) 
            {
                for (int j = i + 1; j < dizi2.length; j++) 
                {
                    if (dizi2[i] == dizi2[j]) 
                    {
                        sayac++;
                        dizi2[j] = -1; 
                    }
                }
                System.out.println(dizi2[i] + " sayısı " + sayac + " kere tekrar edildi.");
            }
        }
        
                
    }
    
}
