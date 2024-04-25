package org.siddhantangore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        for (int i = 0; i < 60; i++) {
            try {
                Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
                System.out.println(i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore the interrupted status
                System.err.println("Thread was interrupted!");
            }
        }
    }
}