package Assignment3;

public class program6 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Provide exactly four command line argument");
            return;
        }
        String id = args[0], name = args[1];
        int departmentNo = Integer.parseInt(args[2]);
        double salary = Double.parseDouble(args[3]);
        display(id, name, departmentNo, salary);
    }

    private static void display(String id, String name, int departmentNo, double salary) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department No.: " + departmentNo);
        System.out.println("Salary: " + salary);
    }
}
