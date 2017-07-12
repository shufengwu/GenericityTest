package com.delta.test.genericitytest;

/**
 * Created by Shufeng.Wu on 2017/7/12.
 */

/*public class Point {
    Object x = 0;
    Object y = 0;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}*/

//泛型类
class Point<T1, T2> {
    T1 x;
    T2 y;

    public T1 getX() {
        return x;
    }

    public void setX(T1 x) {
        this.x = x;
    }

    public T2 getY() {
        return y;
    }

    public void setY(T2 y) {
        this.y = y;
    }

    //泛型方法
    public <T1, T2> void printPoint(T1 x, T2 y) {
        T1 m = x;
        T2 n = y;
        System.out.println(m + "," + n);
    }
}
