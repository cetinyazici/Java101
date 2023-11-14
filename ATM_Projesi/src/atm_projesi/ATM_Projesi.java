package atm_projesi;
import java.util.Scanner;

public class ATM_Projesi {

    public static void main(String[] args) {
        System.out.println("ATM Projesi");
        Scanner input = new Scanner(System.in);
        
        String userName, password;
        int right=3;
        int balance=1500;
        int select;
        int eklenecekTutar;
        int cekilecekTutar;
        
        while(right>0)
        {
            System.out.print("Lutfen kullanıcı adı giriniz: ");
            userName = input.nextLine();
        
            System.out.print("Lutfen şifrenizi giriniz: ");
            password = input.nextLine();
            
            if(userName.equals("patika") && password.equals("dev123"))
            {
                System.out.println("Merhaba Yazıcı Bankasına Hoşheldiniz..");
                do {
                    System.out.println("""
                                       1- Para yat\u0131rma i\u015flemi
                                       2- Para \u00e7ekme i\u015flemii
                                       3- Bakiye sorgulama i\u015flemi 
                                       4- \u00c7\u0131k\u0131\u015f yapma i\u015flemi""");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    
                    switch (select) {
                        case 1 -> {
                            System.out.print("Yatırmaik istediginiz tutarı giriniz: ");
                            eklenecekTutar = input.nextInt();
                            balance += eklenecekTutar;
                        }
                        case 2 -> {
                            System.out.print("Lutfen çekmek istediğiniz tutarı giriniz: ");
                            cekilecekTutar = input.nextInt();

                            if (cekilecekTutar > balance) {
                                System.out.print("Yetersiz Bakiye..");
                            }

                            balance -= cekilecekTutar;
                        }
                        case 3 -> System.out.println("Güncel bakiyeniz: " + balance);
                        case 4 -> System.out.println("Tekrar görüşmek üzere ...");
                        default -> System.out.println("Geçersiz bir seçenek girdiniz. Lütfen tekrar deneyin.");
                    }
                }while(select != 4);
                System.out.println("Tekrar görüşmek üzere ...");
                break;
            }
            else
            {
                right--;
                System.out.println("Hatalı şifre veya Kuallanıcı adı girildi. Tekrar deneyiniz...");
                if(right ==0)
                {
                    System.out.println("Hesabınız bloke olmuştur.. Lutfen banka ile iletişime geçiniz!");
                }
                else
                {
                    System.out.println("Kalan hakkınız: "+ right);
                }
            }
        }
        
        
        
        
        
    }  
}
