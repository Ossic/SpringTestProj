package com.ossic.mapToString;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * created by songyuefeng on 18/1/10
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "11");
        map.put("2", "22");
        System.out.println(StringUtils.join(map));
    }



}
