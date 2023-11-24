/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calismasorulari2;

/**
 *
 * @author Lenovo
 */
public class Student {
    
    private int studentId;
    private int grade;
    
    Student(int studentId, int grade)
    {
        this.studentId=studentId;
        this.grade=grade;
    }
    
    void displayInfo()
    {
        System.out.println("Öğrenci ID: "+this.studentId);
        System.out.println("Öğrenci Seviyesi: "+this.grade);
    }
}
