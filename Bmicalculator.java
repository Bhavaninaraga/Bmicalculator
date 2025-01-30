import java.util.Scanner;
public class Bmicalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("enter your height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight/(height * height);
        System.out.printf("Your BMI is:%2f", bmi);
        if (bmi<18.5) {
            System.out.println("Underweight");
        } else if (bmi>=18.5 && bmi<24.9) {
            System.out.println("Normal weight");
        } else if (bmi>=25 && bmi<29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        scanner.close();
    }
}
