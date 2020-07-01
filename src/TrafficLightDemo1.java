enum TrafficLightColor1 {
    RED(12000), GREEN(10000), YELLOW(2000);
    private int delay;

    TrafficLightColor1(int d) {
        delay = d;
    }

    int getDelay() {
        return delay;
    }
}

class TrafficLightSimulator1 implements Runnable {
    private TrafficLightColor1 tlc;

    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator1(TrafficLightColor1 init) {
        tlc = init;
    }

    TrafficLightSimulator1() {
        tlc = TrafficLightColor1.RED;
    }

    public void run() {
        while (!stop) {
            try {
                Thread.sleep(tlc.getDelay());
            }
            catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor() {
        switch (tlc) {
            case RED -> tlc = TrafficLightColor1.GREEN;
            case YELLOW -> tlc = TrafficLightColor1.RED;
            case GREEN -> tlc = TrafficLightColor1.YELLOW;
        }
        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed)
                wait();
            changed = false;
        }
        catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    synchronized void cancel() {
        stop = true;
    }

    synchronized TrafficLightColor1 getColor() {
        return tlc;
    }
}

public class TrafficLightDemo1 {
    public static void main(String[] args) {
        TrafficLightSimulator1 t1 =
                new TrafficLightSimulator1(TrafficLightColor1.GREEN);
        Thread thrd = new Thread(t1);

        thrd.start();
        for (int i=0; i<9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
