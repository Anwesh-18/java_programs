import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                String capitalized = word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase();
                result.append(capitalized).append(" ");
            }
        }
        System.out.println("After Capitalization: " + result.toString().trim());
    }
}
