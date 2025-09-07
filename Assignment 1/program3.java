import java.util.*;
public class program3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two floating point numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double res = x + y;
        System.out.println("The sum of " + x + " and " + y + " is " + res);
    }
}
