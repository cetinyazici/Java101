package dizidekitekraredenciftsayilaribulan.program;

import java.util.Arrays;

public class DizidekiTekrarEdenCiftSayilariBulanProgram {

    static boolean isFind(int[] array, int value)
    {
        for(int i:array)
        {
            if(i==value)
            {
                return true;
            }      
        }
        return false;         
    }
    
    public static void main(String[] args) {

        int[] list = {4,7,4,4,2,9,10,21,1,33,9,8,8,1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        
        for(int i=0; i<list.length; i++)
        {
            for(int j=0; j<list.length; j++)
            {
                if((i!=j) && (list[i]== list[j]))
                {
                    if(!isFind(duplicate, list[i]))
                    {
                        if(list[i]%2==0)
                        {
                            duplicate[startIndex++]=list[i];
                        }
                        
                    } 
                    break;
                }
            }
        }
        
        System.out.println("Dizi: "+Arrays.toString(list));        
        System.out.println("Tekrar Eden Çiftler: "+Arrays.toString(duplicate)); 
    }
    
}
