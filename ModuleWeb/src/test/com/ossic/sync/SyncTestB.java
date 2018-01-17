package com.ossic.sync;

/**
 * created by songyuefeng on 17/12/2
 */
public class SyncTestB {
    Long count = 0L;

    public static void main(String[] args) throws InterruptedException {
        final SyncTestB resource = new SyncTestB();
        final Long countInMain = 0L;

        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    synchronized (countInMain) {
//                        countInMain++;
                    }
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
