class MyThread implements Runnable {
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }
    public void run() {
        System.out.println(thrdName + " + run");
        try {
            for (int count=0; count<10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + " , counter: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrdName + " - interrupted");
        }
        System.out.println(thrdName + " - completion");
    }
}

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Starting the main thread");
        MyThread mt = new MyThread("Spawned stream #1");
        Thread newThrd = new Thread(mt);
        newThrd.start();

        for (int i=0; i<50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Main thread interruption");
            }
        }
        System.out.println("Main thread completion");
    }
}
