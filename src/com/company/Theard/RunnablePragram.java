package com.company.Theard;

public class RunnablePragram implements Runnable {
    public static void main(String[] args) {
        RunnablePragram runnablePragram = new RunnablePragram();

        Thread t1 = new Thread(runnablePragram);

        t1.start();
        System.out.println(Thread.currentThread().getName() + " is running");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
