import java.util.Scanner;
public class Main5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the substring to replace: ");
        String oldSub = sc.nextLine();
        System.out.print("Enter the new substring: ");
        String newSub = sc.nextLine();
        String result = mainString.replace(oldSub, newSub);
        System.out.println("Resulting string: " + result);
    }
}