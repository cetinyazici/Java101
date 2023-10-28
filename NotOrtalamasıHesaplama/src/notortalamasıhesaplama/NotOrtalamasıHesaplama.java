/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notortalamasıhesaplama;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {
        System.out.println("Not Ortalaması Hesaplama");
        Scanner input = new Scanner(System.in);
        int mt, fk, ka, te, th, mk;
        int topla;
        int sonuc;
        
        System.out.print("Matematik Notunu Giriniz: ");
        mt = input.nextInt();
        
        System.out.print("Fizik Notunu Giriniz: ");
        fk = input.nextInt();
        
        System.out.print("Kimya Notunu Giriniz: ");
        ka = input.nextInt();
        
        System.out.print("Türkçe Notunu Giriniz: ");
        te = input.nextInt();
        
        System.out.print("Tarih Notunu Giriniz: ");
        th = input.nextInt();
        
        System.out.print("Müzik Notunu Giriniz: ");
        mk = input.nextInt();
        
        topla=(mt + fk + ka + te + th + mk);
        sonuc = topla/6;
        
        System.out.println("Ortalama: "+ sonuc);
        
        if(sonuc>=60)
        {
            System.out.println("Geçti...");
        }
        else
            System.out.println("Kaldı...");
    }
    
}

