class Question1 {
    public static void main(String[] args) {
        // Create a reference to the current thread
        Thread t = Thread.currentThread();
        
        // Display thread details
        System.out.println("Thread Reference Details:");
        System.out.println("Class Name: " + t.getClass());
        System.out.println("Thread Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("Thread Group: " + t.getThreadGroup().getName());
    }
}
