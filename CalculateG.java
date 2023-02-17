
import java.util.Scanner;

public class CalculateG {
    
    public static double multiplication(double numX, double numY) {
        return numX * numY;
    }
    
    public static double square(double numX) {
        return numX * numX;
    }
    
    public static double summation(double numX, double numY) {
        return numX + numY;
    }
    
    public static void outline(String message, double result) {
        System.out.println(message + result);
    }
    
    public static void main(String[] arguments) {
        
        Scanner input = new Scanner(System.in);
        
        double gravity = -9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;

        finalPosition = (0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition);
        finalVelocity = (gravity * fallingTime + initialVelocity);

        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
        System.out.println("The object's velocity after " + fallingTime + " seconds is " + finalVelocity + " m/s");

        double firstNum, secondNum;

        System.out.println("Enter the first number:");
        firstNum = input.nextDouble();
        System.out.println("Enter the second number:");
        secondNum = input.nextDouble();

        double multiplicationResult = multiplication(firstNum, secondNum);
        double squareResult1 = square(firstNum);
        double squareResult2 = square(secondNum);
        double summationResult = summation(firstNum, secondNum);

        outline("Multiplication result: ", multiplicationResult);
        outline("Square result for " + firstNum + " is: ", squareResult1);
        outline("Square result for " + secondNum + " is: ", squareResult2);
        outline("Summation result: ", summationResult);
    }
}