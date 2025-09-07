import java.util.*;

public class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num + " is negative number");
        } else {
            System.out.println(num + " is positive number");
        }
    }
}
