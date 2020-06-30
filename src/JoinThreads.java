class Mythreadj implements Runnable {
    Thread thrd;

    Mythreadj(String name) {
        thrd = new Thread(this, name);
    }

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

    public static class createAndStart extends Mythreadj {
        public createAndStart(String name) {
            super(name);
            Mythreadj myThrdj = new Mythreadj(name);
            myThrdj.thrd.start();
        }
    }
}

public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Starting the main thread");
        Mythreadj mt1 = new Mythreadj.createAndStart("Spawned stream #1");
        Mythreadj mt2 = new Mythreadj.createAndStart("Spawned stream #2");
        Mythreadj mt3 = new Mythreadj.createAndStart("Spawned stream #3");

        try {
            mt1.thrd.join();
            System.out.println("Spawned stream #1 - joining");
            mt2.thrd.join();
            System.out.println("Spawned stream #2 - joining");
            mt3.thrd.join();
            System.out.println("Spawned stream #3 - joining");
        }
        catch (InterruptedException exc) {
            System.out.println("Main thread interruption");
        }
        System.out.println("Main thread completion");
    }
}
