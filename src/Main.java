
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("==============================");
            System.out.println("     HEALTH & FITNESS PLANNER");
            System.out.println("==============================");
            System.out.println("1. Calculate daily calories");
            System.out.println("2. Generate a diet plan");
            System.out.println("3. Fitness information");
            System.out.println("4. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Calorie calculator selected.");
                    break;

                case "2":
                    System.out.println("Diet planner selected.");
                    break;

                case "3":
                    System.out.println("Fitness information selected.");
                    break;

                case "4":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        }

        scanner.close();
    }
}
