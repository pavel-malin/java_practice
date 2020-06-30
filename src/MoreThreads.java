class MyThreadn extends Thread {
    Thread thrd;

    MyThreadn(String name) {
        super(name);
        thrd = new Thread(this, name);
    }

    public void run() {
        System.out.println(thrd.getName() + " - run");
        try {
            for (int count=0; count<10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + " , counter: " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - interrupted");
        }
        System.out.println(thrd.getName() + " - completion");
    }

    public static class createAndStart extends MyThreadn {
        public createAndStart(String name) {
            super(name);
            MyThreadn myThrd = new MyThreadn(name);
            myThrd.thrd.start();
        }
    }
}

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Starting the main thread");
        MyThreadn mt1 = new MyThreadn.createAndStart("Spawned stream #1");
        MyThreadn mt2 = new MyThreadn.createAndStart("Spawned stream #2");
        MyThreadn mt3 = new MyThreadn.createAndStart("Spawned stream #3");

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
