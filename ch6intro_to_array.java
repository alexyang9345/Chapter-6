/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.ArrayList;

public class ch6intro_to_array

{
    final static int MAX = 20;

public static void main (String[] args)
{

    //this is a general ArrayList:
    ArrayList list = new ArrayList();
    
    //Type of ArrayList holds only the Type
    ArrayList <String> farm = new ArrayList<>();
    
    farm.add("cow");farm.add("pig");farm.add("chicken");farm.add("ugly duckling");
    farm.add("chicken");farm.add("chicken");farm.add("ugly duckling");
    System.out.println(farm);
    
    for (int i = 0; i < 20; i++)
    {
        farm.add("cow");
        farm.add("dog");
        farm.add("horse");
        farm.add("ugly duckling");
        farm.add("ugly duckling");
    }
    System.out.println(farm);
    
    int count = 0;
    for (int i = 0; i < farm.size(); i++)
    {
        //for (int i = farm.size() - 1; i >= 0; i--)
        if (farm.get(i).equals("cow"))
            count++;
        //.set() replaces tha object and returns the object at that index
        //farm.set(i, "cat");
        
        /*
        if(farm.get(i).equals("chicken"))
            farm.remove(i);
        else
            i++;
        */
        
       while(farm.get(i).equals("chicken"))
            farm.remove(i);    
    }
    System.out.println(farm);
    System.out.println("There are " + count + " cows. ");
    
    ArrayList mycds = new ArrayList();
    
    CD alex = new CD("Coobert", "Jundydago", 0.04, 20);
    CD bob = new CD("Sherman", "Fillimop", 0.00, 12);
    CD charlie = new CD("Herbert", "Butterboy", 0.00, 6);
    /**

         
       int x = 50;
       
       mathy useful = new mathy();
       
       int[] num = new int[10000]; //arrays are objects
       int[] values = new int[20];
       int[] oddnum = new int[num.length];
       int[] evennum = new int[num.length];
       int[] negnum = new int[MAX];
       String[] names = {"Charlie", "Megan", "Tadd", "Patrick", "Jake"};

       Random gen = new Random();
// populate with random numbers range -50 to 50

       for(int i =0; i<num.length; i++)
       {
            num[i] = gen.nextInt(100)-50;
        }

       //prints the array of int ---- off by one error < not <= ------
       for(int i = 0; i<num.length; i++)
       {
            System.out.println( num[i] );
       }
       //for each look
       for (int s : num)
       {
           System.out.println(s);
       }
       
        
        
        
        System.out.println("----------SORTING-----------"  );




        int look = 42;

        //System.out.println("Found" + Searches.linearSearch(num,look)  );
        //Sorts.selectionSort(num);
        Sorts.insertionSort(num);
        System.out.println("Found " + Searches.binarySearch(num,look) );

/*
        //Sorts.selectionSort(num);
        System.out.println(num.length  );
        num = doubleSize(num);


        for (int s : num)
        {
            
        }


        odd(num,oddnum);

        System.out.println("---------------");
        oddnum = useful.getOdd(num);
        //useful.getEven(num, evennum);
        //for each look
        int count = 0;
/*        
        for (int s : oddnum)
        {
            System.out.println(s);
        }
        


/*
        System.out.println("Enter a number");
        int find = Keyboard.readInt();

        System.out.println(Searches. binarySearch(num,find));

   /*
//searching for 412
          for (int i = 0; i < MAX; i++)
          x++;

      // for (int i = 0; i < MAX; i++)
        //  values[num[i]+25] ++;
        //  x++;
        //how do you count the #of times each value comes up?

       for( int i =0; i<num.length; i++)
            System.out.print("\t" + num[i]);

       //for (int i = 0; i<50;i++)
       //   System.out.println("The number of times" + (i-25) +"is" +
       //                       "\t" + values[i]);




/*
       foo(num[0]);
       System.out.println("------" + num[0]);
       
/*       System.out.println(oddnum[7]);

       odd(num,oddnum);

       negnum = neg(num);




    int [][] scores = { {1,2,3},//6
                       {2,2,3},//7
                       {3,2,3},//8
                       {4,2,3} };//9
   
    System.out.println(scores[0].length+" col");
    System.out.println(scores.length+" row");
    
    System.out.println("The sum of this array is " + mathy.sum2DArray(scores) + ". ");
    
    System.out.println("The sum of this row is " + mathy.sumOneRow2DArray(scores, 3) + ". ");
    System.out.println("The sum of this col is " + mathy.sumOneCol2DArray(scores, 3) + ". ");
   
    int [][] table = new int [5][10];
    
    for (int row = 0; row < table.length; row++)
        for (int col = 0; col < table[row].length; col++)
            table[row][col] = row * 10 + col;
    
    for (int row = 0; row < table.length; row++)
    {
        for (int col = 0; col < table[row].length; col++)
            System.out.print(table[row][col] + "\t");
        System.out.println();
    }
/**/   
}// end of main

   public static int[] doubleSize(int[] array)
   {


        return array;


   }

   public static void foo(int x)
   {
       // won't change original integer
       x = 100;
   }



    public static void foo(int [] num)
      {
          // will change original array
          num[0] = 100;
      }




   public static void odd(int[] m_num, int[] m_odd)
   {

       int count =0;


   }// end of odd
}
   
/*
 //====================================================
     public static int[] neg(int[] m_num)
      {


       return negarray;
   }//end of neg

    /*  */

// end of class










