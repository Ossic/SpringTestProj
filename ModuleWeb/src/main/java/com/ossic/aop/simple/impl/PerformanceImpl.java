package com.ossic.aop.simple.impl;

import com.ossic.aop.simple.Performance;
import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {
    public void perform() {
        System.out.println("Performing...");
    }
}
