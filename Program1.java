import java.util.Scanner;

public class program1 {
    private double a;
    private double b;
    private String operation;

    // Constructor to initialize values
    public program1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase(); // make operation case-insensitive
    }

    // Method to perform calculation
    public void calculate() {
        double result;

        switch (operation) {
            case "add":
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case "subtract":
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case "multiply":
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case "divide":
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter: add, subtract, multiply, or divide.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number (a): ");
            double a = scanner.nextDouble();

            System.out.print("Enter second number (b): ");
            double b = scanner.nextDouble();

            scanner.nextLine(); 
            System.out.print("Enter operation (add, subtract, multiply, divide): ");
            String operation = scanner.nextLine();

            program1 calc = new program1(a, b, operation);
            calc.calculate();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }

        scanner.close();
    }
}
