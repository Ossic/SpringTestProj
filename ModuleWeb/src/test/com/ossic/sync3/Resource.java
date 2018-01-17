package com.ossic.sync3;

import java.util.concurrent.atomic.AtomicLong;

/**
 * created by songyuefeng on 17/12/2
 */
public class Resource {
    AtomicLong count = new AtomicLong(0L);
    public Resource() {
    }

    void add(){
//        synchronized (count){
            count.addAndGet(1);
//        }
    }
}
