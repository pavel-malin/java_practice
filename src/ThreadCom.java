class TickTock {
    String state;
    synchronized void tick (boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick");

        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked")) {
                wait();
            }
        }
        catch (InterruptedException exc) {
            System.out.println("Stream interruption");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        state = "tocked";
        notify();

        try {
            while (!state.equals("ticked"))
                wait();
        }
        catch (InterruptedException exc) {
            System.out.println("Stream interruption");
        }
    }
}

class MyThreadt implements Runnable {
    Thread thrd;
    TickTock ttOb;

    MyThreadt(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    public static MyThreadt createAndStart(String name, TickTock tt) {
        MyThreadt myThrd = new MyThreadt(name, tt);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run() {
        if (thrd.getName().compareTo("TickTock") == 0) {
            for (int i=0; i<5; i++)
                ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for (int i=0; i<5; i++)
                ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThreadt mt1 = new MyThreadt("Tick", tt);
        MyThreadt mt2 = new MyThreadt("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc) {
            System.out.println("Main thread interruption");
        }
    }
}
