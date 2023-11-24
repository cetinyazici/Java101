/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calismasorulari2;

/**
 *
 * @author Lenovo
 */
public class Person {
    private String name;
    private int age;
    
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    
    void displayInfo()
    {
        System.out.println("Personel Adı: "+this.name);
        System.out.println("Personel Yaş: "+this.age);
    }
    
}
