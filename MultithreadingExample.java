class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("NumberThread interrupted.");
            }
        }
    }
}

class LetterThread extends Thread {
    public void run() {
        for (char letter = 'A'; letter <= 'E'; letter++) {
            System.out.println("Letter: " + letter);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("LetterThread interrupted.");
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        LetterThread letterThread = new LetterThread();

        numberThread.start(); // Start the number thread
        letterThread.start();  // Start the letter thread

        try {
            numberThread.join(); // Wait for numberThread to finish
            letterThread.join();  // Wait for letterThread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread finished.");
    }
}