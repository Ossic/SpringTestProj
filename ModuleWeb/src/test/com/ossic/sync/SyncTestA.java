package com.ossic.sync;

/**
 * created by songyuefeng on 17/12/2
 */
public class SyncTestA {
    Person person1 = new Person();
    Person person2 = new Person();

    class Task1 implements Runnable{

        public void run() {
            synchronized (person1){
                try {
                    Thread.sleep(5000);
                    System.out.println("in task1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Task2 implements Runnable{

        public void run() {
            synchronized (person2){
                System.out.println("in task2");
            }
        }
    }

    public static void main(String[] args) {
        final SyncTestA resource = new SyncTestA();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (resource.person1){
                    try {
                        System.out.println("in task1");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (resource.person2){
                    System.out.println("in task2");
                }
            }
        });

        System.out.println("start");
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }

}
