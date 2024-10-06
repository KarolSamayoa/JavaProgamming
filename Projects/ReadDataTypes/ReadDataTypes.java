/**
 * This program reads data of various types.
 * */ 

import java.util.Scanner;

public class ReadDataTypes 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter gender (M | F): ");
        char gender = sc.next().charAt(0);
        
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        
        System.out.println("Enter mobile number: ");
        long mobileNo = sc.nextLong();
        
        System.out.println("Enter gpa: ");
        double cgpa = sc.nextDouble();
        
        //Print the values to check if the input was correcty obtained. 
        
        System.out.println("\nYou entered...");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: "+ mobileNo);
        System.out.println("CGPA: " + String.format("%.2f",cgpa));
    }
}

