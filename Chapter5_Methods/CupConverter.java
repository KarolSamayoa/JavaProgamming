/**
 * This program converts cups to fluid ounces.
 */

import java.util.Scanner;

public class CupConverter 
{
    public static void main (String[] args) 
    {
        double cups;  //to hold the number of cups
        double ounces; //to hold the number of ounces
        
        //Get the number of cups. 
        cups = getCups(); 
        
        //convert the cups to fluid ounces.
        ounces = cupsToOunces(cups);
        
        //Display the results.
        displayResults(cups, ounces);
    }
    
    /**
     * The getCups method gets a number of coups from the user.
     * @return The number of cups entered by the user.
     */
    public static double getCups()
    {
        double numCups;  //To hold cups.
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Display an introduction.
        System.out.println("This program converts measurements");
        System.out.println("in cups to fluid ounces. For your");
        System.out.println("reference the formula is:");
        System.out.println(" 1 cup = 8 fluid ounces\n");
        
        //Get the number of cups from the user.
        System.out.print("Enter the number of cups: ");
        numCups = keyboard.nextDouble();
        
        //return the number of cups.
        return numCups;
    }
    
    /**
     * The cupsToOunces converts a number of cups to 
     * liquid ounces, using the formula: 1 cup = 8 fluid ounces.
     * @param numCups the number of cups to convert.
     * @return The number of ounces.
     */
    
    public static double cupsToOunces(double numCups)
    {
        return numCups * 8.0;
    }
    
    /** 
     * The displayResults method display a message showing
     * the results of the conversion.
     * @param cups A number of cups.
     * @param ounces A number of ounces.
     */
    
    public static void displayResults(double cups, double ounces)
    {
        System.out.printf("%.1f cups equals %.1f fluid ounces. \n", cups, ounces);
    }
}
