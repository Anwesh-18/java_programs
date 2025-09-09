package Assignment3;

public class program5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Provide exactly two command line argument");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int a = num1, b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("The gcd of " + num1 + " and " + num2 + " is: " + a);
    }
}
