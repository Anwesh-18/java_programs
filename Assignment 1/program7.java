import java.util.*;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;
        System.out.println(hours + " hours: " + minutes + " minutes: " + seconds + " seconds");
    }
}
