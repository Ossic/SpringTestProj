package com.ossic.sync2;

/**
 * created by songyuefeng on 17/12/2
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        final Statistic sta = new Statistic();
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    sta.add();
                }
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sta.count.value);
    }

}
