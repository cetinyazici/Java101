package matristranspozunubulma;

public class MatrisTranspozunuBulma {

    public static void main(String[] args) {
        System.out.println("Matris Transpozunu Bulma");
        System.out.println("------------------------");
        int[][] array = {
        {1, 2, 3}, 
        {4, 5, 6}, 
        {7, 8, 9}, 
        {10, 11, 12} 
        };
        
        System.out.println("Matris: ");
        for (int i = 0; i <array.length; i++) 
        {
            for (int j = 0; j<array[i].length;  j++) 
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println( "");
        }
        
        System.out.println("Transpoze: ");
        for (int i = 0; i < array[0].length; i++) 
        {
            for (int j = 0; j < array.length; j++) 
            {
                System.out.print(array[j][i] + " ");
            }
            System.out.println("");
        }
    }
    
}
