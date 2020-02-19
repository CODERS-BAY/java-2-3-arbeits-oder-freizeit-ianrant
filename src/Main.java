import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int timeOfDay = 0;

        do {
            System.out.println("Please enter your preferred time of day (24h format) as integer:");
            timeOfDay = scanner.nextInt();

            if (timeOfDay < 0) {
                System.out.println("Negative hours have not yet been invented. Please be patient and enter a positive number:");
            }
            else if (timeOfDay > 24) {
                System.out.println("The 24+ hour day has not yet been invented. Please be patient and enter a positive number:");
            }
            else if (timeOfDay >= 8 && timeOfDay <= 16) {
                System.out.println("You reach us within our office hours.");
                if (timeOfDay == 12) {
                    System.out.println("However, we are on lunch break from 12:00 to 13:00. Please reach us before or after.");
                }
            }
            else {
                System.out.println("You reach us outside of our office hours (8:00 to 16:00)");
            }
        }
        while (!(timeOfDay >= 8 && timeOfDay <= 16));


    }
}
