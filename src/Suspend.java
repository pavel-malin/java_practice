class MyThreadT implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;

    MyThreadT(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    public static MyThreadT createAndStart(String name) {
        MyThreadT myThrd = new MyThreadT(name);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run() {
        System.out.println(thrd.getName() + " - run.");

        try {
            for (int i=1; i<1000; i++) {
                System.out.println(i + " ");
                if ((i%10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if(stopped)
                        break;
                }
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - interrupted");
        }
        System.out.println(thrd.getName() + " - exit");
    }

    synchronized void mystop() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mysuspend() {
        suspended = true;
    }

    synchronized void myresume() {
        suspended = false;
        notify();
    }
}

public class Suspend {
    public static void main(String[] args) {
        MyThreadT mt1 = MyThreadT.createAndStart("My stream");

        try {
            Thread.sleep(1000);
            mt1.mysuspend();
            System.out.println("Pause flow");
            Thread.sleep(1000);
            mt1.myresume();
            System.out.println("Resume stream");
            Thread.sleep(1000);
            mt1.mysuspend();
            System.out.println("Pause flow");
            Thread.sleep(1000);
            mt1.myresume();
            System.out.println("Resume stream");
            mt1.mystop();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interruption");
        }

        try {
            mt1.thrd.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interruption");
        }
    }
}
