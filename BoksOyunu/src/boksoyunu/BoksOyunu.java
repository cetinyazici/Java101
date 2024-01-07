package boksoyunu;
public class BoksOyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Boks Oyunu");
        
        Fighter marc = new Fighter("Çetin" , 20 , 100, 90, 0);
        Fighter alex = new Fighter("Mami" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
        
        
        
    }
    
}
