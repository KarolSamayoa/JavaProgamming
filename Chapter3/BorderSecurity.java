import java.util.Scanner;

public class BorderSecurity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables for the current year and visitor details
        final int CURRENT_YEAR = 2524;
        String nationality;
        char visa = 'n';
        int passportExpirationYear;
        int age;
        char guardian = 'n';

        // Prompt for nationality
        System.out.print("Enter your nationality: ");
        nationality = scanner.nextLine();

        // Check nationality
        if (!nationality.equalsIgnoreCase("Aclaris")) {
            System.out.println("Your nationality is valid.");
        } else {
            // If the visitor is from Aclaris, check if they have a visa
            System.out.println("Citizens of Aclaris must have a visa.");
            System.out.print("Do you have a visa? (y/n): ");
            visa = scanner.next().charAt(0);
            
            if (visa == 'y' || visa == 'Y') {
                System.out.println("Your visa is valid.");
            } else {
                // Exact wording fix
                System.out.println("You do not have a visa. Admission denied.");
                return;  // End the program if the visitor is denied admission
            }
        }

        // Prompt for passport expiration year
        System.out.print("Enter the expiration year of your passport: ");
        passportExpirationYear = scanner.nextInt();

        // Check passport expiration year
        if (passportExpirationYear > CURRENT_YEAR) {
            System.out.println("Your passport is valid.");
        } else {
            System.out.println("Your passport has expired. Admission denied.");
            return;  // End the program if the visitor is denied admission
        }

        // Prompt for age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // Check age
        if (age > 18) {
            System.out.println("Your age is valid.");
        } else {
            // If the visitor is under 18, check if they have a guardian
            System.out.print("Do you have a guardian? (y/n): ");
            guardian = scanner.next().charAt(0);

            if (guardian == 'y' || guardian == 'Y') {
                System.out.println("You have a valid guardian.");
            } else {
                System.out.println("You do not have a guardian. Admission denied.");
                return;  // End the program if the visitor is denied admission
            }
        }

        // If all checks are passed
        System.out.println("You have passed the checks. Admission granted.");
    }
}
