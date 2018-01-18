package com.ossic.regEx;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * created by songyuefeng on 18/1/17
 */
public class RegExTest {
    public static void main(String[] args) {
        String s1 = "w12314123";
        String s2 = "21312312";
        String s3 = "1231w1231";
        String s4 = "wqerqer";

        boolean ret1 = sidCheck(s1);
        boolean ret2 = sidCheck(s2);
        boolean ret3 = sidCheck(s3);
        boolean ret4 = sidCheck(s4);

        System.out.println(ret1);
        System.out.println(ret2);
        System.out.println(ret3);
        System.out.println(ret4);
    }

    private static boolean sidCheck(String sid) {
        if (StringUtils.isBlank(sid)) {
            return false;
        }
        String regEx = "^w?\\d+$";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(sid);
        return matcher.matches();
    }
}
