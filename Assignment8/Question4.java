import java.util.Scanner;
class PalindromeThread extends Thread {
    private int number;
    PalindromeThread(int number) {
        this.number = number;
    }
    public void run() {
        int original = number;
        int reversed = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if (reversed == original)
            System.out.println("The number " + number + " is a Palindrome.");
        else
            System.out.println("The number " + number + " is not a Palindrome.");
    }
}
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        PalindromeThread t = new PalindromeThread(num);
        t.start();
        if (num <= 1) {
            System.out.println("The number " + num + " is neither prime nor composite.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println("The number " + num + " is Prime.");
            else
                System.out.println("The number " + num + " is Composite.");
        }
    }
}