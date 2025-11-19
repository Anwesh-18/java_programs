import java.util.Scanner;
class TableThread extends Thread {
    private int number;
    TableThread(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Table thread interrupted");
            }
        }
    }
}
class FactorialThread extends Thread {
    private int number;
    FactorialThread(int number) {
        this.number = number;
    }
    public void run() {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Factorial thread interrupted");
            }
        }
        System.out.println("Factorial of " + number + " = " + fact);
    }
}
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        TableThread t1 = new TableThread(num);
        FactorialThread t2 = new FactorialThread(num);
        t1.start();
        t2.start();
    }
}
