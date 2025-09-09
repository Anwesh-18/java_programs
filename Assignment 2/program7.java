import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, reversed = 0;

        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        if (num == reversed) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
