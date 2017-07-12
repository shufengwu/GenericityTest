package com.delta.test.genericitytest;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Point point = new Point();
        point.setX(10);
        point.setY(20);
        int x = (int) point.getX();
        int y = (int) point.getY();
        System.out.println(x+"-----"+y);

        point.setX(25.4);
        point.setY("东经180度");

        double m = (Double)point.getX();
        String n = (String)point.getY();
        System.out.println(m+"-----"+n);*/

        Point<Integer,Integer> point1 = new Point<>();
        point1.setX(10);
        point1.setY(20);
        int x = point1.getX();
        int y = point1.getY();
        System.out.println(x+"-----"+y);
        point1.printPoint(point1.getX(),point1.getY());

        Point<Double,String> p2 = new Point<>();
        p2.setX(25.4);
        p2.setY("东经180度");
        double m = p2.getX();
        String n= p2.getY();
        System.out.println(m+"-----"+n);
        point1.printPoint(p2.getX(),p2.getY());
    }
}
