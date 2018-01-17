package com.ossic.sync2;

/**
 * created by songyuefeng on 17/12/2
 */
public class Statistic {
    MyLong count = new MyLong();

    public Statistic() {
    }

    void add(){
        synchronized (count){
            count.value++;
        }
    }
}
