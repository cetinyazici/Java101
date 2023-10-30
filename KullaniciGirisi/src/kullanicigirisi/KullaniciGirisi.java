package kullanicigirisi;
import java.util.Scanner;

public class KullaniciGirisi {
    
    public static void main(String[] args) {
        System.out.println("Kullanıcı Girişi");
        Scanner input = new Scanner(System.in);
        
        String sifre, kullaniciAdi;
        int secim;        
        
        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();
        
        System.out.print("Lütfen şifrenizi giriniz: ");
        sifre = input.nextLine();
        
        if (kullaniciAdi.equals("patika") && sifre.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } 
        else {
            System.out.println("Bilgileriniz yanlış!");
            
            System.out.println("Şifreyi sıfırlamak ister misiniz? (1-Evet 2-Hayır)");
            secim = input.nextInt();
            
            switch (secim) {
                case 1:
                    System.out.print("Yeni şifre oluşturun: ");
                    String yeniSifre = input.next();
                    
                    if (yeniSifre.equals(sifre)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                    } else {
                        sifre = yeniSifre;
                        System.out.println("Şifre başarıyla değiştirildi.");
                    }
                    break;
                    
                case 2:
                    System.out.println("Çıkış yapıldı...");
                    break;
                    
                default:
                    System.out.println("Yanlış seçim yapıldı!");
            }
        }        
        
        input.close();
    }
}
