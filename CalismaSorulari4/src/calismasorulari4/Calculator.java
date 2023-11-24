/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calismasorulari4;

/**
 *
 * @author Lenovo
 */
public class Calculator {
    // private türünde bir String değişkeni olan "result" adında bir sonuç değişkeni
    private String result;

    // Toplama işlemi
    public void add(double num1, double num2) {
        result = String.valueOf(num1 + num2);
    }

    // Çıkarma işlemi
    protected void subtract(double num1, double num2) {
        result = String.valueOf(num1 - num2);
    }

    // Çarpma işlemi
    void multiply(double num1, double num2) {
        result = String.valueOf(num1 * num2);
    }

    // Bölme işlemi
    public void divide(double num1, double num2) {
        if (num2 != 0) {
            result = String.valueOf(num1 / num2);
        } else {
            result = "Undefined (division by zero)";
        }
    }

    // private türünde bir String değişkeni olan "result" adındaki sonuç değişkenine erişim metodu
    public String getResult() {
        return result;
    }
    
}
