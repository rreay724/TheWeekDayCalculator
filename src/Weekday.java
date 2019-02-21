import java.util.Scanner;

public class Weekday {

    public static void main(String[] args) {


        // Displays legend
        System.out.println("This will calculate what day of the week for date provided.");
        System.out.println("=================================================================");

        Scanner scanner = new Scanner(System.in);

        // Get day, month and year
        System.out.println("Enter day: ");
        int day = scanner.nextInt();

        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        /** century and yearpart variables **/
        // For 2007 the century would be 20
        int century = year/100;

        // Yearpart is the year within the century. For 1994 the yearpart would be 94
        int yearPart = year % 100;


        /** The Algorithm to calculate the day of the week is as follows:
         weekday = (day + (((month + 1) *26) / 10) + yearpart + (yearpart/4) + (century/4) + (5*century)) mod 7 **/

        int weekDay = (day + (((month + 1) * 26) / 10) + yearPart + (yearPart/4) + (century/4) + (5 * century)) % 7;

        System.out.println("=================================================================");

        // Array used to associate name of day with number and print day name
        String [] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("The day of the week is " + daysOfWeek[weekDay]);

    }




}
