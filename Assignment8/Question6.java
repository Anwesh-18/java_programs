// import java.util.Scanner;
// class SquareThread extends Thread {
//     private int number;
//     SquareThread(int number) {
//         this.number = number;
//     }
//     public void run() {
//         int square = number * number;
//         System.out.println("Square of " + number + " = " + square);
//     }
// }
// class SumThread extends Thread {
//     private int number;
//     SumThread(int number) {
//         this.number = number;
//     }
//     public void run() {
//         int sum = 0, temp = number;
//         while (temp != 0) {
//             sum += temp % 10;
//             temp /= 10;
//         }
//         System.out.println("Sum of digits of " + number + " = " + sum);
//     }
// }
// public class Question6 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         SquareThread t1 = new SquareThread(num);
//         // SumThread t2 = new SumThread(num);
//         t1.start();
//         t2.start();
//     }
// }
