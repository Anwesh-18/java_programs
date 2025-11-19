import java.util.Scanner;
class OddThread extends Thread {
    private int m, n;
    OddThread(int m, int n) {
        this.m = m;
        this.n = n;
    }
    public void run() {
        System.out.println("Odd numbers between " + m + " and " + n + ":");
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        OddThread t = new OddThread(m, n);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Even numbers between " + m + " and " + n + ":");
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
