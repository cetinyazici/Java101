package enbuyukenkucuksayilaribulmaıslemi;
import java.util.Scanner;

public class EnbuyukEnkucukSayilariBulmaIslemi {

    public static void main(String[] args) {
        System.out.println("En büyük ve en küçük sayıları bulma işlemi");        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int number = input.nextInt();
        
        int i = 1;
        int enBuyuk = Integer.MIN_VALUE; // En büyük sayıyı saklamak için başlangıç değeri olarak en küçük integer değeri
        int enKucuk = Integer.MAX_VALUE; // En küçük sayıyı saklamak için başlangıç değeri olarak en büyük integer değeri
        
        while (i <= number) {
            System.out.print(i + ". Sayı giriniz: ");
            int currentNumber = input.nextInt();
            
            // En büyük sayıyı güncelle
            if (currentNumber > enBuyuk) {
                enBuyuk = currentNumber;
            }
            
            // En küçük sayıyı güncelle
            if (currentNumber < enKucuk) {
                enKucuk = currentNumber;
            }
            
            i++;
        } 
        
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }   
}
