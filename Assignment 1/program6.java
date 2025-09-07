import java.util.*;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks in English: ");
        double english = sc.nextDouble();
        System.out.print("Enter your marks in Maths: ");
        double maths = sc.nextDouble();
        System.out.print("Enter your marks in Science: ");
        double science = sc.nextDouble();
        double average = (english + maths + science) / 3;
        System.out.println("The average marks in 3 subjects is :" + average);
    }
}
