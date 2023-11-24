/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calismasorulari4;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class CalismaSorulari4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Calculator sınıfından bir nesne (calculator) oluşturun
        Calculator calculator = new Calculator();

        System.out.print("Sayi1: ");
        double num1 = input.nextDouble();

        System.out.print("Sayi2: ");
        double num2 = input.nextDouble();

        System.out.print("İşlemi Seçiniz (+, -, *, /): ");
        String operation = input.next();

        // Kullanıcının girdiği işlemi kullanarak uygun Calculator sınıfı metodu ile matematiksel işlemi gerçekleştirin
        // ve sonucu "result" değişkenine kaydedin
        switch (operation) {
            case "+":
                calculator.add(num1, num2);
                break;
            case "-":
                calculator.subtract(num1, num2);
                break;
            case "*":
                calculator.multiply(num1, num2);
                break;
            case "/":
                calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        // Sonucu ekrana yazdırın
        System.out.println("Result: " + calculator.getResult());
    }
}
    

