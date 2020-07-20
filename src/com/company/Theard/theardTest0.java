package com.company.Theard;


public class theardTest0 {

    public void method1() {
        System.out.println("no synchronized: " + "method1 start");
        try {
            System.out.println("no synchronized: " + "method1 exec");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("no synchronized: " + "method1 completion");
    }

    public void method2() {
        System.out.println("no synchronized: " + "method2 start");
        try {
            System.out.println("no synchronized: " + "method2 exec");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("no synchronized: " + "method2 completion");
    }

    public synchronized void nmethod1() {
        System.out.println("method1 start");
        try {
            System.out.println("method1 exec");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method1 completion");
    }

    public synchronized void nmethod2() {
        System.out.println("method2 start");
        try {
            System.out.println("method2 exec");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method2 completion");
    }


    public static void main(String[] args) {
        theardTest0 m1 = new theardTest0();
        theardTest0 m2 = new theardTest0();

//        new Thread(() -> m1.method1()).start();
//        new Thread(() -> m2.method2()).start();
        new Thread(() -> m1.nmethod1()).start();
        new Thread(() -> m2.nmethod2()).start();
    }

}

