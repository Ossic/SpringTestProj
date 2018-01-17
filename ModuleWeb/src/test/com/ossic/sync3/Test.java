package com.ossic.sync3;

/**
 * created by songyuefeng on 17/12/2
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        final Resource resource = new Resource();
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    resource.add();
                }
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(resource.count);
    }
}
