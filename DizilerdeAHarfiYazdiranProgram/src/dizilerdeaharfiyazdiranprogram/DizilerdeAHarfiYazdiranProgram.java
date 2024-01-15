package dizilerdeaharfiyazdiranprogram;
public class DizilerdeAHarfiYazdiranProgram {

    public static void main(String[] args) {
        
        System.out.println("A");
        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) 
        {
            for (int j = 0; j < letter[i].length; j++) 
            {
                if (i == 0 || i == 2) 
                {
                    letter[i][j] = " * ";
                } 
                else if (j == 0 || j == 3) 
                {
                    letter[i][j] = " * ";
                } 
                else 
                {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter)
        {
            for (String col : row)
            {
                System.out.print(col);
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");
        System.out.println("B");
        String[][] letter2 = new String[7][4];

        for (int i = 0; i < letter2.length; i++) 
        {
            for (int j = 0; j < letter2[i].length; j++) 
            {
                if (i == 0 || i == 3 || i==6) 
                {
                    letter2[i][j] = " * ";
                } 
                else if (j == 0 || j == 3) 
                {
                    letter2[i][j] = " * ";
                } 
                else 
                {
                    letter2[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter2)
        {
            for (String col : row)
            {
                System.out.print(col);
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");
        System.out.println("C");
        String[][] letter3 = new String[7][4];

        for (int i = 0; i < letter3.length; i++) 
        {
            for (int j = 0; j < letter3[i].length; j++) 
            {
                if (i == 0 || i==6) 
                {
                    letter3[i][j] = " * ";
                } 
                else if (j == 0) 
                {
                    letter3[i][j] = " * ";
                } 
                else 
                {
                    letter3[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter3)
        {
            for (String col : row)
            {
                System.out.print(col);
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");
        System.out.println("E");
        String[][] letter4 = new String[7][4];

        for (int i = 0; i < letter4.length; i++) 
        {
            for (int j = 0; j < letter4[i].length; j++) 
            {
                if (i == 0 || i==6 || i==3) 
                {
                    letter4[i][j] = " * ";
                } 
                else if (j == 0) 
                {
                    letter4[i][j] = " * ";
                } 
                else 
                {
                    letter4[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter4)
        {
            for (String col : row)
            {
                System.out.print(col);
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------------");
        System.out.println("F");
        String[][] letter5 = new String[7][4];

        for (int i = 0; i < letter5.length; i++) 
        {
            for (int j = 0; j < letter5[i].length; j++) 
            {
                if (i == 0 || i==3) 
                {
                    letter5[i][j] = " * ";
                } 
                else if (j == 0) 
                {
                    letter5[i][j] = " * ";
                } 
                else 
                {
                    letter5[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter5)
        {
            for (String col : row)
            {
                System.out.print(col);
            }
            System.out.println();
        }
        
    }
    
}
