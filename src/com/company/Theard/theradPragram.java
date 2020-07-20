package com.company.Theard;

import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.List;

public class theradPragram extends Thread {

    public static void main(String[] args) {
        theradPragram mytherad = new theradPragram();
        theradPragram mytherad1 = new theradPragram();
        theradPragram mytherad2 = new theradPragram();
//        List<Integer> list = new ArrayList<>();
//            for (int i = 0;i< 50;i++){
//                if (
//                        i%2 != 0
//                ){
//                    list.add(i);
//                }
//            }
//
//        System.out.println(Thread.currentThread().getName() + ":" +list);
        //线程优先级
        System.out.println("theradPriority:"+mytherad.getPriority());
        mytherad.setPriority(Thread.MIN_PRIORITY);
        System.out.println("theradPriority:"+mytherad.getPriority());
        //线程设置name和id
        mytherad.setName("第一个线程");
        System.out.println(mytherad.getId());
        //线程等待
        mytherad.start();
        try {
            mytherad.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mytherad1.start();
        mytherad2.start();

    }

    @Override
    public void run() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<5;i++){
            if (
                    i%2 == 0
            ){
                list.add(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("error:"+e);
            }
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
        //线程睡眠

//        System.out.println(Thread.currentThread().getName() + ":" +list);
    }
}
