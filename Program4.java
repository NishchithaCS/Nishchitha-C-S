import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Map to store counts for divisors 1 through 9
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Initialize map with keys 1 to 9 and values 0
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Count how many numbers are divisible by 1 to 9
        for (int divisor = 1; divisor <= 9; divisor++) {
            int count = 0;
            for (int number : numbers) {
                if (number % divisor == 0) {
                    count++;
                }
            }
            countMap.put(divisor, count);
        }

        // Print the result
        System.out.println("Output:");
        System.out.println(countMap);
    }
}
