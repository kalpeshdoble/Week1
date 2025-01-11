import java.util.Scanner;

public class CalendarDisplay {

    // Array to store the names of months
    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    static int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Method to get the number of days in the month, accounting for leap years in February
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year has 29 days
        }
        return daysInMonth[month - 1];
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return months[month - 1];
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;

        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        // Get the month name and number of days in the month
        String monthName = getMonthName(month);
        int numDays = getDaysInMonth(month, year);

        // Get the first day of the month (0=Sun, 1=Mon, ..., 6=Sat)
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the month and year
        System.out.println("     " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for the month and year
        System.out.print("Enter month 1-12 : ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

       
    }
}
