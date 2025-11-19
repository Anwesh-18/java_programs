import java.util.Scanner;
class OddIndexThread extends Thread {
    private int[] arr1, arr2, result;
    OddIndexThread(int[] arr1, int[] arr2, int[] result) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.result = result;
    }
    public void run() {
        for (int i = 1; i < arr1.length; i += 2) {
            result[i] = arr1[i] * arr2[i];
        }
    }
}
class EvenIndexThread extends Thread {
    private int[] arr1, arr2, result;
    EvenIndexThread(int[] arr1, int[] arr2, int[] result) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.result = result;
    }
    public void run() {
        for (int i = 0; i < arr1.length; i += 2) {
            result[i] = arr1[i] * arr2[i];
        }
    }
}
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        OddIndexThread t1 = new OddIndexThread(arr1, arr2, result);
        EvenIndexThread t2 = new EvenIndexThread(arr1, arr2, result);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Product of arrays:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}