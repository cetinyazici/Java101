package boksoyunu;
import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            // İlk dövüşçüyü belirleme kısmı
            Fighter firstAttacker = determineFirstAttacker();

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                
                // Sıranın kimde olduğunu kontrol et ve saldırıyı gerçekleştir
                if (firstAttacker == f1) {
                    f2.health = f1.hit(f2);
                } else {
                    f1.health = f2.hit(f1);
                }

                // Kazanan kontrolü
                if (isWin()) {
                    break;
                }

                // Sıranın değişimini gerçekleştir
                firstAttacker = (firstAttacker == f1) ? f2 : f1;

                // Skoru yazdır
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    private Fighter determineFirstAttacker() {
        Random random = new Random();
        // 0 veya 1 elde edilir, %50 olasılıkla birinci veya ikinci dövüşçü ilk saldırıyı yapar
        int randomNumber = random.nextInt(2);
        return (randomNumber == 0) ? f1 : f2;
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health <= 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}

