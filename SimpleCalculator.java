import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println(" ");
        System.out.println(" ");
        
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero [infinity]");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }

        System.out.println("Your result is : " + result);
        System.out.println("CONGRATULATIONS! Your result is :- " +  result);
        scanner.close();
    }
}
