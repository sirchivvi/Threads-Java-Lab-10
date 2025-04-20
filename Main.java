// Name: Akhil Chivukula
// PRN: 23070126009
// Batch: AIML 2023-27

// File: Main.java

package main;

import threads.MessagePrinter;
import threads.CounterThread;
import threads.EvenOddThread;

public class Main {
    public static void main(String[] args) {
        // Thread to print a custom message 5 times
        MessagePrinter messageThread = new MessagePrinter("Thread demo running", 5);

        // Runnable thread to count numbers up to 10
        Thread counterThread = new Thread(new CounterThread(10));

        // Threads to print even and odd numbers
        EvenOddThread evenThread = new EvenOddThread(1, 20, true);
        EvenOddThread oddThread = new EvenOddThread(1, 20, false);

        // Start all threads
        messageThread.start();
        counterThread.start();
        evenThread.start();
        oddThread.start();
    }
}
