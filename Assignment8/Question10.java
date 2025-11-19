import java.util.Scanner;
class SumThread extends Thread {
    private int start, end;
    private static int totalSum = 0;
    private static final Object lock = new Object();

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public void run() {
        int localSum = 0;
        for (int i = start; i <= end; i++) {
            localSum += i;
        }
        synchronized (lock) {
            totalSum += localSum;
        }
    }
    public static int getTotalSum() {
        return totalSum;
    }
}
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n (natural numbers up to n): ");
        int n = sc.nextInt();
        System.out.print("Enter number of threads (m): ");
        int m = sc.nextInt();
        SumThread[] threads = new SumThread[m];
        int range = n / m;
        int start = 1;
        for (int i = 0; i < m; i++) {
            int end = (i == m - 1) ? n : start + range - 1;
            threads[i] = new SumThread(start, end);
            threads[i].start();
            start = end + 1;
        }
        for (int i = 0; i < m; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum of first " + n + " natural numbers = " + SumThread.getTotalSum());
    }
}