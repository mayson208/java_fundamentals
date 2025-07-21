package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */


class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running - count: " + i);
            try {
                Thread.sleep(500); // simulate work
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
    }
}

public class Exercise_01 {
    public static void main(String[] args) {
        // First way: Create Runnable instance, then pass to Thread
        MyRunnable runnable1 = new MyRunnable("Thread-1");
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        // Second way: Create and start thread using a new Runnable inline
        Thread thread2 = new Thread(new MyRunnable("Thread-2"));
        thread2.start();
    }
}