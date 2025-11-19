class FirstThread extends Thread {
    public void run() {
        System.out.println("First Thread is running...");
    }
}
class SecondThread extends Thread {
    public void run() {
        System.out.println("Second Thread is running...");
    }
}
public class Question8 {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY); 
        System.out.println("Priority of First Thread: " + t1.getPriority());
        System.out.println("Priority of Second Thread: " + t2.getPriority());
        t1.start();
        t2.start();
    }
}