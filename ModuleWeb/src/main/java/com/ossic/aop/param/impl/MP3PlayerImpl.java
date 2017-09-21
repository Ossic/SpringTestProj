package com.ossic.aop.param.impl;

import com.ossic.aop.param.MP3Player;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class MP3PlayerImpl implements MP3Player {
    public void play(int num) {
        System.out.println("曲目<" + num + "> 正在播放...");
    }

    public boolean isLegal(String in) {
        if (null == in) {
            return false;
        }
        if (!StringUtils.isNumeric(in)) {
            return false;
        }
        int num = Integer.parseInt(in);
        if (num < 1 || num > 5) {
            return false;
        } else {
            return true;
        }
    }
}
