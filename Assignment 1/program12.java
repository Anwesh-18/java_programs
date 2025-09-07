import java.util.*;

public class program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num + " is negative number");
        } else if (num > 0) {
            System.out.println(num + " is positive number");
        } else {
            System.out.println(num + " is a zero");
        }
    }
}
