package diküçgendehipotenüsbulanprogram;

import java.util.Scanner;

public class DikÜçgendeHipotenüsBulanProgram {
    public static void main(String[] args) {     
        System.out.println("Dik Üçgende Hipotenüs Bulan Program");
        int dikKenar1, dikKenar2, hipotenüs;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen Birinci Dik Kenarı Giriniz: ");
        dikKenar1 = input.nextInt();
        
        System.out.print("Lütfen İkinci Dik Kenarı Giriniz: ");
        dikKenar2 = input.nextInt();
        
        hipotenüs =  (int) Math.sqrt(dikKenar1*dikKenar1 + dikKenar2*dikKenar2);
        System.out.println("Hipotenüs: "+hipotenüs);
                
    }
    
}
