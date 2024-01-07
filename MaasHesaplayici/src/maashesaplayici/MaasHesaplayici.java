/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maashesaplayici;

/**
 *
 * @author Lenovo
 */
public class MaasHesaplayici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Maaş Hesaplayıcı");
        
        Employee kemal = new Employee("kemal", 2000, 45, 1985);
        kemal.raiseSalary();
        System.out.println(kemal.toString());
    }
    
}
