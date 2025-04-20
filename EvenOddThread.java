// File: EvenOddThread.java

package threads;

public class EvenOddThread extends Thread {
    private int start;
    private int end;
    private boolean isEven;

    public EvenOddThread(int start, int end, boolean isEven) {
        this.start = start;
        this.end = end;
        this.isEven = isEven;
    }

    // Prints even or odd numbers from start to end
    public void run() {
        for (int i = start; i <= end; i++) {
            if ((i % 2 == 0) == isEven) {
                System.out.println((isEven ? "Even" : "Odd") + ": " + i + " | Thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(400); // 400ms delay
                } catch (InterruptedException e) {
                    System.out.println("EvenOddThread interrupted.");
                }
            }
        }
    }
}
