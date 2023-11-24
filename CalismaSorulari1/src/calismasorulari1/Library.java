/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calismasorulari1;

/**
 *
 * @author Lenovo
 */
public class Library {
    private static final int MAX_BOOKS=20; //en fazala alınabilecek kitap sayısı
    private Book[] books; //kitapları saklamak için dizi tanımladım
    private int bookCount;
    
    public Library()
    {
        books = new Book[MAX_BOOKS];
        bookCount=0;
    }
    
    void bookAdd(Book book)
    {
        if(bookCount<=MAX_BOOKS)
        {
            books[bookCount++]=book;
            System.out.println("Kitap Kütüphaneye Eklendi....");
        }
        else
        {
            System.out.println("Kütüphane Dolu Kitap Ekleme İşlemi Başarız....");
        }
    }
    
    void displayBooks()
    {
        System.out.println("Kütüphanedeki Kitaplar: ");
        for (int i = 0; i < bookCount; i++) 
        {
            books[i].displayInfo();
        }       
    }
    
}
