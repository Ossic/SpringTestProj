package com.ossic.MapNull;

import java.util.HashMap;
import java.util.Map;

/**
 * created by songyuefeng on 17/12/8
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", null);
        String ret = map.get("1");
        System.out.println(ret);
    }
}
