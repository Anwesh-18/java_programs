import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        int num = sc.nextInt();
        String day;

        switch (num) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                System.out.println("Invalid day number");
                return;
        }
        System.out.println("The corresponding day is " + day);
    }
}
