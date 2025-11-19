import java.util.Scanner;
class ArmstrongChecker implements Runnable {
    private int number;
    ArmstrongChecker(int number) {
        this.number = number;
    }
    public void run() {
        int original = number;
        int sum = 0;
        int digits = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        temp = number;
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }
        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
    }
}
public class Question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        ArmstrongChecker checker = new ArmstrongChecker(num);
        Thread t = new Thread(checker);
        t.start();
    }
}