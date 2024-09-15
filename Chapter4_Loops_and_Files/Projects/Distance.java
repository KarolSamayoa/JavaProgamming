import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int speed = -1;
        int time = 0;

        System.out.print("Enter vehicle speed (in mph): ");
        while (speed < 0) {
            if (scanner.hasNextInt()) {
                speed = scanner.nextInt();
                if (speed < 0) {
                    System.out.print("Enter vehicle speed (in mph): ");
                }
            } else {
                scanner.next(); 
                System.out.print("Enter vehicle speed (in mph): ");
            }
        }

       
        System.out.print("Enter traveling time (in hours): ");
        while (time < 1) {
            if (scanner.hasNextInt()) {
                time = scanner.nextInt();
                if (time < 1) {
                    System.out.print("Enter traveling time (in hours): ");
                }
            } else {
                scanner.next(); 
                System.out.print("Enter traveling time (in hours): ");
            }
        }

        for (int i = 1; i <= time; i++) {
            int distance = speed * i;
            System.out.println("After " + i + " hour(s) the distance is " + distance + " miles.");
        }

        scanner.close();
    }
}
