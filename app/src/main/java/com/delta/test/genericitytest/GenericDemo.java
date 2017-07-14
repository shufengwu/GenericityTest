package com.delta.test.genericitytest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Shufeng.Wu on 2017/7/13.
 */

public class GenericDemo {
    public static void main(String[] args) {
        // 创建
        ArrayList array = new ArrayList();
        // 添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        //添加int类型的元素
        array.add(10);
        // JDK5以后的自动装箱
        // 等价于： array.add(Integer.valueOf(10));
        // 遍历
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
