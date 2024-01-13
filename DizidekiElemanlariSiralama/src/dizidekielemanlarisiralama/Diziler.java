package dizidekielemanlarisiralama;

import java.util.Arrays;
import java.util.Scanner;

public class Diziler {

    static void printArray(int[] array){
        
        for(int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }      
    }
    
    static void printArray(double[] array){
        
        for(int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }      
    }
    
    static int[] reverse(int[] list)
    {
        int[] reverse = new int[list.length];
        
        for(int i=0, j=list.length-1; i<list.length;i++,j--)
        {
             reverse[i]=list[j];
        }
        
        return reverse;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] list = new int[10];
       
        for(int i=0; i<list.length; i++)
        {
            list[i]=(i*10)+10;
            System.out.println(list[i]);
        }
        
        double[] list2 = {10.5,20.10,30.15,40.20,50.25,60.30,70.35,80,90,100};
        
        for(int i=1; i<list2.length;i++)
        {
            System.out.println(i+". Elamanı: "+list[i-1]);
        }
        
        printArray(list);
        printArray(list2);
        
        int[] list3 = {10,20,30,40,50,60,70,80,90,100};
        int[] newListe = reverse(list3);
        printArray(newListe);
        
        
        
        double[] listeDouble = new double[5];
        listeDouble[0]=5.5;
        System.out.println("Listenin birini elemanı: "+listeDouble[0]);
        
        
        String[] günler = {"pazartesi","salı","çarşamba","perşembe"};
        
        System.out.println("birinci gün: "+günler[0]);
        System.out.println("Günler dizisinin boyutu: "+günler.length);
        System.out.println("listeDouble dizisinin boyutu: "+listeDouble.length);
        
        for(int i=0; i<=(günler.length)-1; i++)
        {
            System.out.println(günler[i]);
        }
        
        System.out.println("====================================");
        
        int[] numbers = {35,65,95}; 

        System.out.print(numbers.length + "," + numbers[1]);
        
        int cars[], count=3;
        cars = new int[count];
        for(int i=0; i<cars.length; i++)
            cars[i] = (i+1)*2;
        for(int j=0; j<cars.length; j++)
            System.out.println(cars[j] + ",");

        System.out.println("=======================");
        
        int[][] matrix =new int[5][4]; //satır sütün şeklindedir.
        
        for(int row=0; row < matrix.length; row++)
        {
            for(int col=0; col<matrix[row].length; col++)
            {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        System.out.println("------------------------------------");
        /*
            Arrays.toString()
            Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.
        
            Arrays.fill(diziAdi,baslangıcIndisi,bitisIndisi)
            Arrays.fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.
        
            Arrays.sort()
            Arrays.sort() metodu ile dizilerdeki elemanları sıralayabiliriz.
        
            Arrays.binarySearch()
            Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir. Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.
            
            Arrays.copyOf() ve Arrays.copyOfRange() metotu
            Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır
            Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.
        
            Arrays.equals() metotu
            Java'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.
        
        */
        System.out.println("------------------------------------");
        
        int[] number = {11,2,3,74,5,6,7,8,9,0};
        
        //System.out.println("Dizinin Elemanları: "+ Arrays.toString(number));
        
    
        //Arrays.fill(number, 1);
        //System.out.println("Dizinin Elemanları: "+Arrays.toString(number));
        
        System.out.println("Dizinin Elemanları: "+Arrays.toString(number));
        Arrays.fill(number, 9,10,10);
        System.out.println("Dizinin Elemanları: "+Arrays.toString(number));
        
        System.out.println("----------------------------------");
        
        Arrays.sort(number);
        System.out.println("Dizinin Sıralanmış hali: "+Arrays.toString(number));
        
        System.out.println("----------------------------------");
        
        int index = Arrays.binarySearch(number, 11);
        System.out.println(Arrays.toString(number));
        System.out.println("11 değerinin indisi: "+index);
        
        System.out.println("----------------------------------");
        
        System.out.println("Liste: "+Arrays.toString(number));
        
        int[] copyArray = Arrays.copyOf(number, 5);
        System.out.println("copyArray: "+ Arrays.toString(copyArray));
        
        int[] copyOfRangeArray = Arrays.copyOfRange(number, 3, 7);
        System.out.println("copyOfRangeArray: "+Arrays.toString(copyOfRangeArray));
        
        
        
    }

    
}
