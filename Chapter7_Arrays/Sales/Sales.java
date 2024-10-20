/**
 * This program gathers sales amount for the week.
 * It uses the SalesData class to display the total, 
 * average, highest, and lowest sales amounts. 
 */

import java.util.Scanner;

public class Sales 
{
    public static void main (String[] args) 
    {
        final int ONE_WEEK = 7; //Number of elements
        
        //Create an array to hold the sales amount for a week.
        double[] sales = new double[ONE_WEEK];
        
        //Get the week's sales figures.
        getValues(sales);
        
        //Create a SalesData object, initialized
        //with the week's sales figures.
        SalesData week = new SalesData(sales);
        
        //Display the total, average, highest, and lowest 
        //sales amounts for the week.
        
        System.out.printf("Total Sales:    $%,.2f\n", week.getTotal());
        System.out.printf("Average Sales:  $%,.2f\n", week.getAverage());
        System.out.printf("Highest Sales:  $%,.2f\n", week.getHighest());
        System.out.printf("Lowest Sales:   $%,.2f\n", week.getLowest());
    }
    
    /**The getValues method asks the user to enter sales
     * amounts for each element of an array.
     * @param array The array to store the values in.
     */
    
    private static void getValues(double[] array)
    {
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Get sales for each day of the week. 
        for (int i = 0; i< array.length; i++) 
        {
            System.out.print("Enter the sales for day " +
                                (i+1) + ": ");
            array[i] = keyboard.nextDouble();
        }
    }
}
