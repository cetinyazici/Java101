package minesweeper;
import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    private final char[][] oyunTahtasi;
    private final char[][] mayinTahtasi;
    private final int satirSayisi;
    private final int sutunSayisi;
    private final int mayinSayisi;
    private int acilanHucreSayisi;

    public MineSweeper(int satirSayisi, int sutunSayisi) {
        this.satirSayisi = satirSayisi;
        this.sutunSayisi = sutunSayisi;
        this.mayinSayisi = satirSayisi * sutunSayisi / 4; 
        this.oyunTahtasi = new char[satirSayisi][sutunSayisi];
        this.mayinTahtasi = new char[satirSayisi][sutunSayisi];
        this.acilanHucreSayisi = 0;
        tahtalariOlustur();
        mayinlariYerlestir();
    }

    private void tahtalariOlustur() {
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                oyunTahtasi[i][j] = '-';
                mayinTahtasi[i][j] = '0';
            }
        }
    }

    private void mayinlariYerlestir() {
        Random rand = new Random();
        int yerlestirilenMayinSayisi = 0;
        while (yerlestirilenMayinSayisi < mayinSayisi) {
            int satir = rand.nextInt(satirSayisi);
            int sutun = rand.nextInt(sutunSayisi);
            if (mayinTahtasi[satir][sutun] != '*') {
                mayinTahtasi[satir][sutun] = '*';
                yerlestirilenMayinSayisi++;
            }
        }
    }

    private boolean gecerliMi(int satir, int sutun) {
        return satir >= 0 && satir < satirSayisi && sutun >= 0 && sutun < sutunSayisi;
    }

    private void hucreyiAc(int satir, int sutun) {
        if (!gecerliMi(satir, sutun)) {
            System.out.println("Geçersiz hücre. Lütfen tekrar deneyin.");
            return;
        }
        if (oyunTahtasi[satir][sutun] != '-') {
            System.out.println("Bu hücre zaten açıldı. Lütfen başka birini seçin.");
            return;
        }
        if (mayinTahtasi[satir][sutun] == '*') {
            tahtalariGoster(mayinTahtasi);
            System.out.println("Oyun Bitti!!");
            System.exit(0);
        }
        int sayi = komsuMayinSayisi(satir, sutun);
        oyunTahtasi[satir][sutun] = (char) (sayi + '0');
        acilanHucreSayisi++;
        if (sayi == 0) {
            komsulariAc(satir, sutun);
        }
        tahtalariGoster(oyunTahtasi);
        if (acilanHucreSayisi == satirSayisi * sutunSayisi - mayinSayisi) {
            System.out.println("Tebrikler! Oyunu kazandınız!");
            System.exit(0);
        }
    }

    private void komsulariAc(int satir, int sutun) {
        for (int i = satir - 1; i <= satir + 1; i++) {
            for (int j = sutun - 1; j <= sutun + 1; j++) {
                if (gecerliMi(i, j) && oyunTahtasi[i][j] == '-') {
                    hucreyiAc(i, j);
                }
            }
        }
    }

    private int komsuMayinSayisi(int satir, int sutun) {
        int sayi = 0;
        for (int i = satir - 1; i <= satir + 1; i++) {
            for (int j = sutun - 1; j <= sutun + 1; j++) {
                if (gecerliMi(i, j) && mayinTahtasi[i][j] == '*') {
                    sayi++;
                }
            }
        }
        return sayi;
    }

    private void tahtalariGoster(char[][] tahta) {
        System.out.println("===============");
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print(tahta[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void oyna() {
        Scanner scanner = new Scanner(System.in);
        tahtalariGoster(oyunTahtasi);
        while (true) {
            System.out.print("Satır: ");
            int satir = scanner.nextInt();
            System.out.print("Sütun: ");
            int sutun = scanner.nextInt();
            hucreyiAc(satir, sutun);
        }
    }
}
