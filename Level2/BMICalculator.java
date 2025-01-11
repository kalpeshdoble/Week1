import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[][] personData = new double[10][3];  
        String[] bmiStatus = new String[10]; 
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Input for weight and height 
            System.out.print("Enter weight kg: ");
            personData[i][0] = scanner.nextDouble();

            System.out.print("Enter height cm: ");
            personData[i][1] = scanner.nextDouble();

            // Calculate and store BMI
            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
        }

       
        bmiStatus = determineBMIStatus(personData);

        // Display the results
        System.out.println("BMI and Status of the team members:");
        System.out.println("Person\tWeight kg\tHeight cm\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                (i + 1), personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        double heightInMeters = height / 100;
        // BMI formula: weight (kg) / height^2 (m^2)
        return weight / (heightInMeters * heightInMeters);
    }

    // Method to determine the BMI status for each person
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            double bmi = personData[i][2];
            if (bmi < =18.4 {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }
}

