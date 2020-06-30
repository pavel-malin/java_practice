class MyThreads implements Runnable {
    Thread thrd;
    MyThreads(String name) {
        thrd = new Thread(this, name);
    }
/*
 This error
    public static MyThreads createAndStart(String name) {
        MyThreads myThrd = new MyThreads(name);
        myThrd.thrd.start();
        return myThrd;
    }
*/
    public void run() {
        System.out.println(thrd.getName() + " - run.");
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

    public static class createAndStart extends MyThreads {
        public createAndStart(String name) {
            super(name);
            MyThreads myThrd = new MyThreads(name);
            myThrd.thrd.start();
        }
    }
}

public class ThreadVariations {
    public static void main(String[] args) {
        System.out.println("Starting the main thread");
        MyThreads mt = new MyThreads.createAndStart("Spawned stream #1");
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
