import java.util.Scanner;

public class ServerResponse 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the server response code
        System.out.print("Enter the server response code: ");
        int responseCode = scanner.nextInt();

        // Use switch to print the appropriate message
        switch (responseCode)
        {
            case 200:
                System.out.println("OK");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            default:
                System.out.println("Unknown Response Code");
                break;
        }
    }
}

