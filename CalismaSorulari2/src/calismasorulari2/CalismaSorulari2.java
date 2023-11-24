/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calismasorulari2;

/**
 *
 * @author Lenovo
 */
public class CalismaSorulari2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person1 = new Person("Ahmet",45);
        person1.displayInfo();
        
        Student student1 = new Student(4,85);
        student1.displayInfo();
    }
    
}
