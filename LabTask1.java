import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("numbers.txt");
            System.out.println("Enter ten integer values: ");

            for (int i = 0; i < 10; i++) {
                int num = input.nextInt();
                writer.write(num + "\n");
            }

            writer.close();
        } 
        catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
