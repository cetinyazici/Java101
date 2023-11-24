/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calismasorulari1;

/**
 *
 * @author Lenovo
 */
public class Book {
    private String title;
    private String author;
    private int year;
    
    Book(String title, String author, int year)
    {
        this.title=title;
        this.author=author;
        this.year=year;
    }
    
    
    void displayInfo()
    {
        System.out.println("Kitap Adı: "+this.title);
        System.out.println("Kitap Yazarı: "+this.author);
        System.out.println("Yayın Yılı: "+this.year);
        System.out.println("-----------------------");
    }
}
