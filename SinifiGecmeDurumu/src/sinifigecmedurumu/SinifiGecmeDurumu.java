package sinifigecmedurumu;
import java.util.Scanner;

public class SinifiGecmeDurumu {

    public static void main(String[] args) {
        System.out.println("Sınıfı Geçme Durumu Hesaplama");

        Scanner input = new Scanner(System.in);

        int matematik, fizik, türkce, kimya, müzik;
        int geçerliDersSayisi = 0;
        double ortalama = 0;

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            ortalama += matematik;
            geçerliDersSayisi++;
        } else {
            System.out.println("Geçersiz Matematik Notu!");
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            ortalama += fizik;
            geçerliDersSayisi++;
        } else {
            System.out.println("Geçersiz Fizik Notu!");
        }

        System.out.print("Türkçe Notunuz: ");
        türkce = input.nextInt();
        if (türkce >= 0 && türkce <= 100) {
            ortalama += türkce;
            geçerliDersSayisi++;
        } else {
            System.out.println("Geçersiz Türkçe Notu!");
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            ortalama += kimya;
            geçerliDersSayisi++;
        } else {
            System.out.println("Geçersiz Kimya Notu!");
        }

        System.out.print("Müzik Notunuz: ");
        müzik = input.nextInt();
        if (müzik >= 0 && müzik <= 100) {
            ortalama += müzik;
            geçerliDersSayisi++;
        } else {
            System.out.println("Geçersiz Müzik Notu!");
        }

        if (geçerliDersSayisi > 0) {
            ortalama /= geçerliDersSayisi;
            System.out.println("Ortalamanız: " + ortalama);

            if (ortalama >= 55) {
                System.out.println("Sınıfı Geçtiniz...");
            } else {
                System.out.println("Sınıfta kaldınız...");
            }
        } else {
            System.out.println("Hiç geçerli ders notu girilmedi.");
        }
    }
}
