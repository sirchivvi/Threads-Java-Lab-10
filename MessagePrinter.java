// File: MessagePrinter.java

package threads;

public class MessagePrinter extends Thread {
    private String message;
    private int count;

    public MessagePrinter(String message, int count) {
        this.message = message;
        this.count = count;
    }

    // Prints the message multiple times
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println("Message: " + message + " | Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500); // half-second delay
            } catch (InterruptedException e) {
                System.out.println("MessagePrinter interrupted.");
            }
        }
    }
}
