package harmoniksayilaribulanprogram;
import java.util.Scanner;

public class HarmonikSayilariBulanProgram {

    public static void main(String[] args) {
        System.out.println("Harmonik Sayilari Bulan Program");
        Scanner input = new Scanner(System.in);
        
        int number;
        double result=0.0;
        System.out.print("Lutfen bir sayi giriniz: ");
        number = input.nextInt();
        
        for(int i=1; i<=number; i++)
        {
            result += (1.0/i);
        }
        
        /*
            for(double i=1; i<=number; i++)
            {
                result += (1/i);
            }
        şeklinde de olurdu ama bu iki seçenektde yapılmazsa yanlış olur int in int e bölümü int olacaktur.
        */
        System.out.println("Sonuç: "+ result);
    }
    
}
