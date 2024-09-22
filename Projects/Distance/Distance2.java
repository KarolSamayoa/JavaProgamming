import java.util.Scanner;


public class Distance2
{
	public static void main(String[] args) 
	{
	    Scanner keyboard = new Scanner(System.in);
	    
	    System.out.print("Enter vehicle speed (in mph): ");
        int speed = keyboard.nextInt();
        
        while (speed <=0 ) 
        {
            System.out.print("Enter vehicle speed (in mph): ");
            speed = keyboard.nextInt();
        } 
        
        System.out.print("Enter traveling time (in hours): ");
        int time = keyboard.nextInt();
        
        while(time <=0)
        {
            System.out.print("Enter traveling time (in hours): ");
            time = keyboard.nextInt();
        }
        
        for (int i = 1; i <=time; i++)
        {
            int distance = speed * i;
            System.out.println("After "+ i + " hour(s) the disance is "+ distance + " miles.");
        }       
        
	}
}

