package fibonacciserisibulanprogram;
import java.util.Scanner;
public class FibonacciSerisiBulanProgram {

    public static void main(String[] args) {
        System.out.println("fibonacci serisi bulan program");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();
        
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int toplam = a + b;
            a = b;
            b = toplam;
        }
        
    }
    
}
