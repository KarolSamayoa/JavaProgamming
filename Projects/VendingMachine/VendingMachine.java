import java.util.Scanner;

public class VendingMachine 
{
    public static void dispense (int selectChoice)
    {
        switch (selectChoice) 
        {
            case 1:
                System.out.println("You bought a coke");
                break;
            case 2:
                System.out.println("You bought a sunkist");
                break;
            case 3:
                System.out.println("You bought a Sprite");
                break;
            default:
                System.out.println("Invalid Selection");
                break;
        }
    }
    public static void getMenu()
    {
        Scanner scanner = new Scanner(System.in);
        
        int choice = 0; 
        
        while (choice != 4) // 4 is the sentinel value to exit loop. 
        {
            System.out.println();
            System.out.println("Vending Machine");
            System.out.println("1. Coke");
            System.out.println("2. Sunkist");
            System.out.println("3. Sprite");
            System.out.println("4. Quite");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            
            dispense(choice);
        }
        
        scanner.close();
    }
    
    public static void main(String[] args)
    {
        getMenu();
    }
}

