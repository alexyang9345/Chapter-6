import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
//import javax.swing.*;

public class mathy
{
    private int [][] square;
    private int [][] magic_square;
    private int magic_num;

    /**
        default constructor - stubed in

    */
    public mathy()
    {
            System.out.println ("hi from default constructor");

    }

    public mathy(int [][] array)
    {
        square = array;
        magic_square = square;
    }


    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    */
    public int abs (int x)
    {
        if (x < 0)
            x = -x;

        return x;



    }//end of abs






    //}end of class




    /**
        takes the odd numbers out of an array
        @param int[] values
        @return int[] odd values in the array
    */

    public  int[] getOdd ( int[] num1)
    {   
        int i = 0;
        int [] odd = new int[num1.length];
        
        for (; i < num1.length; i++)
        {
            if (num1[i]%2 != 0)
                odd[i] = num1[i];
        }
        
        return odd;


    }//end of getOdd



    /**
     * takes the even numbers out of an array
     * @param int[] values, int[] even values
     * @return none
     */


    public void getEven(int[] num, int even [])
    {
        int i = 0, z = 0;
        
        for(; i < num.length; i++)
        {
            if (num[1] % 2 == 0)
                even[i] = num[i];
        
        
        }
        
    }//end of getEven







    /**
        two int parameters and adds them
        @param 2 int values
        @return int sum of values
    */


    public int add (int x, int y)
    {   //System.out.println(sum );
        int sum;      //sum x and y are local var
        sum = x+y;

        return sum;


    }//end of add


    public double add (double x,double y)
    {

        return x+y;
    }

    /**
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


    public void switchThem (int[] a1, int a2[])
    {
        int [] temp = a1;




    }
    public void count(int[] a1, int[] a2)
    {
        for (int i : a1)
            a2[i] ++;



    }


    public static int sum2DArray(int[][] scores)
    {
        int sum = 0;


        for ( int row=0; row < scores.length; row++)
        {
            for ( int col=0; col < scores[row].length; col++)
            {
                System.out.print (scores[row][col] + "\t");
                sum += scores[row][col];
            }
            System.out.println();
        }

        
        return sum;

    }



    public static int sumOneRow2DArray(int[][] array, int num)
    {   
        int total = 0;
        for(int row = 0; row < array.length; row++)
        {
            if (row == num)
            {
                for (int col = 0; col < array[row].length; col++)
                {
                    total += array[row][col];
                }
            }
        }



        return total;

    }

    public static int sumOneCol2DArray(int[][] array, int col)
    {   
        int total = 0;
        
        for(int row = 0; row < array.length; row++)
        {
            total += array[row][col-1];
        }


        return total;

    }



    public int[] sumall2DArray(int [][] scores)
    {
        int [] temp = {1,2,3,4,};




        return temp;
    }

    /**
        Doubles the size of an array
        @param int []
        @return int [] twice the size, with values copied over
    */
    public static int[] doubleSize(int[] array)
    {
       //make temp 2 times the size of array
       int[] temp = new int[array.length * 2];
       System.out.println(temp.length +"-" );

        //copy all the values over to new array
       for (int i = 0; i < array.length; i++)
            temp[i] = array[i];

        //old array changes reference to new larger array
       array = temp;

        return array;

    }

    public static void displayNim(int[] stones)
    {
       for (int i = 0; i < 3; i++)
       {
           for (int j = 0; j < stones[i]; j++)
           {
               System.out.print("O");
           }
       }
       
       System.out.println("\n");




    }
    
    public boolean isMagic()
    {
       //returns true or false based on whether or not the square is magic (check returns a boolean)
       return check();
    }//end of class
    
    public void setMagicSquare(int [][] magic_square)
    {
        //initializes variables and magic_square
        int value = 0;
        this.magic_square = magic_square;
        magic_num = 0;
        
        //sets the magic_num for each square
        for (int i = 0; i < magic_square[0].length; i++)
        {
            value = magic_square[0][i];
            magic_num += value;
        }
    }
    
    public boolean check()
    {
        //initializes variables
        int row_total = 0, col_total = 0, diag_total1 = 0, diag_total2 = 0, max_index = magic_square[0].length - 1;
        boolean test, error = true;
        //
        for (int i = 0; i < magic_square[0].length; i++)
        {
            //checks the total of a row and a column (from first to last)
            for (int j = 0; j < magic_square[0].length; j++)
            {
                row_total += magic_square[i][j];
                col_total += magic_square[j][i];
            }
            //checks to see if both the row and column add up to the magic_num
            if (row_total == magic_num && col_total == magic_num)
            {
                error = false;
            }
            else
                error = true;
        
            //resets the row_total and col_total so that they can be used again in the for loop
            row_total = 0;
            col_total = 0;
            //tracks the total of each diagonal
            diag_total1 += magic_square[i][i];
            diag_total2 += magic_square[max_index - i][i];
        }
        //checks to see if all the diagonals, rows, and columns all add up to the same magic_num

        if (diag_total1 == magic_num && diag_total2 == magic_num && error == false)
        {
            test = true;
        }
        else
        {
            test = false;
        }
        //returns true or false based on whether or not the square is magic
        return test;
    }
    public int getMagicNum()
    {
        //returns the magic number!!!!!!!!
        return magic_num;
    }
}