import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practical29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 student marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("\nAll Marks:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("\n\nHighest Marks: " + max);
        System.out.println("Lowest Marks: " + min);

        sc.close();
    }
              }
