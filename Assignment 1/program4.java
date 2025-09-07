import java.util.*;
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        x += y;
        y = x - y;
        x -= y;
        System.out.println("After swapping x: " + x + " and y: " + y);
    }
}
