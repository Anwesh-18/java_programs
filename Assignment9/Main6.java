import java.util.Scanner;
public class Main6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = sc.nextLine().trim();
        String[] parts = name.split(" ");
        String initials = "";
        for (String part : parts) {
            if (part.length() > 0) {
                initials += Character.toUpperCase(part.charAt(0));
            }
        }
        System.out.println("Your initials: " + initials);
    }
}
