package com.ossic.aop.param;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class CounterAspect {
    private Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

    @Pointcut("execution(* MP3Player.play(int)) && args(trackNum)")
    public void trackPlay(int trackNum) {
    }

    @Before("trackPlay(num)")
    public void updateCountMap(int num) throws Exception {
//        if (num < 1 || num > 5) {
//            throw new RuntimeException("beyond legal number range");
//        }
        int currentCount = getCountByNum(num);
        countMap.put(num, currentCount + 1);
        printMap();
    }

    @AfterThrowing(pointcut = "trackPlay(num)", throwing = "e")
    public void ThrowingHandler(int num, Throwable e){
        System.out.println("in AfterThrowing");
        e.printStackTrace();
        System.out.println("***" + e + "***");
    }

    private int getCountByNum(int num) {
        return countMap.containsKey(num) ? countMap.get(num) : 0;
    }

    private void printMap() {
        for(int key : countMap.keySet()){
            System.out.println("num:" + key + " count:" + countMap.get(key));
        }
    }
}
