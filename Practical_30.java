import java.util.HashMap;
import java.util.Scanner;

public class Practical30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            word = word.toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        sc.close();
    }
          }
