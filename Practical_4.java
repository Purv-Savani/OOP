import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightPound = sc.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInch = sc.nextDouble();

        double weightKg = weightPound * 0.45359237;
        double heightMeter = heightInch * 0.0254;

        double bmi = weightKg / (heightMeter * heightMeter);

        System.out.println("Your BMI is: " + bmi);

        sc.close();
    }
  }
