public class UseMain {
    public static void main(String[] args) {
        Thread thrd;

        thrd = Thread.currentThread();

        System.out.println("Main stream name " + thrd.getName());
        System.out.println("Priority: " + thrd.getPriority());
        System.out.println();
        System.out.println("Set name and priority\n");
        thrd.setName("Flow #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);
        System.out.println("New main stream name: " + thrd.getName());
        System.out.println("New priority value: " + thrd.getPriority());
    }
}
