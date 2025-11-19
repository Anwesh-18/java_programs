class Question1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread Reference Details:");
        System.out.println("Class Name: " + t.getClass());
        System.out.println("Thread Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("Thread Group: " + t.getThreadGroup().getName());
    }
}
