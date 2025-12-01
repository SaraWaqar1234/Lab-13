import java.io.*;
import java.util.*;

public class LabTask2 {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            Scanner reader = new Scanner(file);
            ArrayList<Integer> list = new ArrayList<Integer>();

            while (reader.hasNextInt()) {
                list.add(reader.nextInt());
            }

            reader.close();

            Collections.sort(list);
            System.out.println("Sorted Numbers:");
            for (int num : list) {
                System.out.println(num);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not Found.");
        }
    }
}

  