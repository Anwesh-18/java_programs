class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
public class Question2{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("Worker-Thread");
        t1.start();
        System.out.println("Thread Name: " + t1.getName());
        System.out.println("Thread ID: " + t1.getState());
        System.out.println("Is thread alive? " + t1.isAlive());
        System.out.println("Is thread alive after completion? " + t1.isAlive());
    }
}
