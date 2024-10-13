import java.util.Scanner;

public class OrbitalImmigration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constant for the current year
        final int CURRENT_YEAR = 3024;

        // Variables to store visitor details
        String species;
        char workPermit = 'n';
        int securityClearance = -1; // -1 indicates no clearance
        int passportExpirationYear;
        int age;
        char travelExperience = 'n';

        // Prompt for the visitor's species
        System.out.print("Enter your species: ");
        species = scanner.nextLine();

        // Check species and respective requirements
        if (species.equalsIgnoreCase("Zentari")) {
            // Check for work permit
            System.out.print("Do you have a work permit? (y/n): ");
            workPermit = scanner.next().charAt(0);

            // If they don't have a work permit, deny entry
            if (workPermit == 'n' || workPermit == 'N') {
                System.out.println("You do not have a valid work permit. Entry denied.");
                return; // End the program if admission is denied
            } else {
                System.out.println("You have a valid work permit.");
            }
        } else if (species.equalsIgnoreCase("Krylon")) {
            // Check for security clearance
            System.out.print("Enter your security clearance code (any positive integer): ");
            securityClearance = scanner.nextInt();

            // If clearance is invalid, deny entry
            if (securityClearance <= 0) {
                System.out.println("Invalid clearance. Entry denied.");
                return; // End the program if admission is denied
            } else {
                System.out.println("You have valid clearance.");
            }
        } else {
            System.out.println("Your species is valid for entry.");
        }

        // Prompt for passport expiration year
        System.out.print("Enter the expiration year of your passport: ");
        passportExpirationYear = scanner.nextInt();

        // Check if the passport is valid
        if (passportExpirationYear <= CURRENT_YEAR) {
            System.out.println("Your passport has expired. Entry denied.");
            return; // End the program if admission is denied
        } else {
            System.out.println("Your passport is valid.");
        }

        // Prompt for the visitor's age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // Check if the visitor is under 150 years old
        if (age < 150) {
            // If under 150, check for travel experience
            System.out.print("Do you have intergalactic travel experience? (y/n): ");
            travelExperience = scanner.next().charAt(0);

            // If they don't have travel experience, deny entry
            if (travelExperience == 'n' || travelExperience == 'N') {
                System.out.println("No valid travel experience. Entry denied.");
                return; // End the program if admission is denied
            } else {
                System.out.println("You have valid travel experience.");
            }
        } else {
            System.out.println("Your age is valid.");
        }

        // If all checks are passed, grant entry
        System.out.println("You have passed the checks. Entry granted.");
    }
}
