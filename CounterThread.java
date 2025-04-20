// File: CounterThread.java

package threads;

public class CounterThread implements Runnable {
    private int limit;

    public CounterThread(int limit) {
        this.limit = limit;
    }

    // Counts from 1 to the specified limit
    public void run() {
        for (int i = 1; i <= limit; i++) {
            System.out.println("Count: " + i + " | Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(300); // 300ms delay
            } catch (InterruptedException e) {
                System.out.println("CounterThread interrupted.");
            }
        }
    }
}
