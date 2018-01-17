package com.ossic.forTest;

import java.util.HashSet;
import java.util.Set;

/**
 * created by songyuefeng on 17/11/29
 */
public class Hello {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        System.out.println(set.remove(1));
        System.out.println(set.remove(1));


//        TestBean bean = new TestBean();
//        System.out.println(bean.getResultCode().getCode());

        TestBean b = null;
        System.out.println(b);
    }
}
