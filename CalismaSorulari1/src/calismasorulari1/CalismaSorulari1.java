/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calismasorulari1;

/**
 *
 * @author Lenovo
 */
public class CalismaSorulari1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Book book1 = new Book("Acı tebessüm","Çetin Yazıcı",2023);
        Book book2 = new Book("Çalıkuşu","Reşat Nuri",2000);
        book1.displayInfo();
        book2.displayInfo();
        
        Library library = new Library();
        
        library.bookAdd(book2);
        library.bookAdd(book1);
        
        library.displayBooks();
        
    }
    
}
