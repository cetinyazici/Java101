package vücütkitleındeksihesaplama;
import java.util.Scanner;

public class VücütKitleIndeksiHesaplama {

    public static void main(String[] args) {
        System.out.println("Vücut Kitle İndeksi Hesaplama");
        Scanner input = new Scanner(System.in);
        
        float boy, inds, kilo;
        
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextFloat();
        
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextFloat();
        
        inds = kilo / (boy * boy);  
        
        System.out.println("Vücut Kitle İndeksiniz: " + inds);
                

        
    }
    
}
