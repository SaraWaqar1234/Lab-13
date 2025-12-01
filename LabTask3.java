import java.io.*;
import java.util.*;

public class LabTask3 {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = new int[1000];
        int count = 0;

        try {
            Scanner reader = new Scanner(new File("numbers.txt"));
            while (reader.hasNextInt()) {
                int n = reader.nextInt();
                if (!isPrime(n)) {
                    numbers[count++] = n;
                }
            }
            reader.close();

            PrintWriter writer = new PrintWriter(new File("numbers.txt"));
            for (int i = 0; i < count; i++) {
                writer.print(numbers[i] + "\n");
            }
            writer.close();

            System.out.println("Updated file saved without prime numbers.");

        } catch (Exception e) {
            System.out.println("Error processing file.");
        }
    }
}


