import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a value for a: ");
        int a = scanner.nextInt();

        // Determine how many odd numbers to print
        int count = (a % 2 == 0) ? a - 1 : a;

        // Print the series
        System.out.print("Output: ");
        for (int i = 0; i < count; i++) {
            int oddNumber = 2 * i + 1;
            if (i < count - 1) {
                System.out.print(oddNumber + ", ");
            } else {
                System.out.print(oddNumber); 
            }
        }

        scanner.close();
    }
}
