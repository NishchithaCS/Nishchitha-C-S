import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the value of 'a'
        System.out.print("Enter a value for a: ");
        int a = scanner.nextInt();

        // Generate and print the series
        for (int i = 0; i < a; i++) {
            int oddNumber = 2 * i + 1;
            if (i < a - 1) {
                System.out.print(oddNumber + ", ");
            } else {
                System.out.print(oddNumber); 
            }
        }

        scanner.close();
    }
}
