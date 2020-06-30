class SumArraya {
    private int sum;

    int sumArraya(int[] nums) {
        sum =0;

        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println("The current value of the amount for " + Thread.currentThread().getName() +
                    " will be " + sum);

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException exc) {
                System.out.println("Stream aborted.");
            }
        }
        return sum;
    }
}

class MyThreada implements Runnable {
    Thread thrd;

    static SumArraya sa = new SumArraya();

    int[] a;
    int answer;

    MyThreada(String name,int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
    }

    public static class createAndStart extends MyThreadc {
        public createAndStart(String name, int[] nums) {
            super(name, nums);
            MyThreadc myThrd = new MyThreadc(name, nums);
            myThrd.thrd.start();
        }

    }

    public void run() {
        int sum;
        System.out.println(thrd.getName() + " - run.");

        synchronized (sa) {
            answer = sa.sumArraya(a);
        }
        System.out.println("Amount for " + thrd.getName() + " will be " + answer);
        System.out.println(thrd.getName() + " - completion");
    }
}

class Sync0 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        MyThreadc mt1 = new MyThreadc.createAndStart("Spawned stream #1", a);
        MyThreadc mt2 = new MyThreadc.createAndStart("Spawned stream #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc) {
            System.out.println("Main thread interruption");
        }
    }
}
