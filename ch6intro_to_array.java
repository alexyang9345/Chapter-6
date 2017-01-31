/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;

public class ch6intro_to_array

{
    final static int MAX = 20;

public static void main (String[] args)
{


/**/

         
       int x = 50;
       
       mathy useful = new mathy();
       
       int[] num = new int[1000]; //arrays are objects
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
       
        
        
/**        
        System.out.println("----------SORTING-----------"  );



/**/
        int look = 42;
/**/
        System.out.println("Found" + Searches.linearSearch(num,look)  );
        //System.out.println(Searches.binarySearch(num,look)  );


/**/
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




*/
       foo(num[0]);
       System.out.println("------" + num[0]);
       
/*       System.out.println(oddnum[7]);

       odd(num,oddnum);

       negnum = neg(num);


*/
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
/*
 //====================================================
     public static int[] neg(int[] m_num)
      {


       return negarray;
   }//end of neg

    /*  */
}
// end of class











