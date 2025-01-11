
import java.util.*;

public class UnitConverter2 {

    // Method To convert kilometers to miles and return the value
    public static double convertYardsToFeet(double yards) {
        // Convert yards to feet
        double yards2feet = 3;

        double feet = yards * yards2feet;

        
        return feet;
    }

    public static double convertFeetToYards(double feet) {
        // Convert feet to yards
        double feet2yards = 0.333333;

        double yards = feet * feet2yards;

        // return the value
        return yards;
    }

    public static double convertMeterToInches(double meter) {
        // Convert meter to inches
        double meter2inches = 39.3701;

        double inches = meter * meter2inches;

        
        return inches;
    }

    public static double convertInchesToMeter(double inches) {
        // Convert inches to meter
        double inches2meter = 0.0254;

        double meter = inches * inches2meter;

        
        return meter;
    }

    public static double convertInchesToCentimeter(double inch) {
        // Convert inches to centimeter
        double inches2centimeter = 2.54;

        double centimeter = inch * inches2centimeter;

       
        return centimeter;
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // Take input 
        System.out.print("Enter input in yards: ");
        double yards = sc.nextDouble();
        double feetres = UnitConverter2.convertYardsToFeet(yards);
        System.out.println("In feet: " + feetres);
        System.out.print("Enter the input in feet: ");

        double feet = sc.nextDouble();
        double yardsres = UnitConverter2.convertFeetToYards(feet);
        System.out.println("In yards: " + yardsres);
        System.out.print("Enter the input in meter: ");

        double meter = sc.nextDouble();
        double inchres = UnitConverter2.convertMeterToInches(meter);
        System.out.println("In inches: " + inchres);
        System.out.print("Enter the input in inches: ");

        double inches = sc.nextDouble();

        // Call the method to convert feet to meter
        double meterres = UnitConverter2.convertInchesToMeter(inches);

        // Display value in meter
        System.out.println("In meter: " + meterres);
        System.out.print("Enter the input in inch: ");

        double inch = sc.nextDouble();

        // Call the method to convert feet to meter
        double centimeterres = UnitConverter2.convertInchesToCentimeter(inch);

        // Display value in centimeter
        System.out.println("In centimeter: " + centimeterres);

        
    }
}
