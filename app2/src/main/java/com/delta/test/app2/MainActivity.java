package com.delta.test.app2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Point<Integer, Integer> p1 = new Point<>();
        p1.setX(10);
        p1.setY(20);
        printPoint(p1);
        printNumberPoint(p1);

        Point<String, String> p2 = new Point<>();
        p2.setX("东京180度");
        p2.setY("北纬210度");
        printPoint(p2);
        printStringPoint(p2);
    }

    public static void printPoint(Point<?, ?> p) {  // 使用通配符
        System.out.println("This point is: " + p.getX() + ", " + p.getY());
    }

    public static void printNumberPoint(Point<? extends Number,? extends Number> p){
        System.out.println("x "+p.getX()+" y "+p.getY());
    }

    public static void printStringPoint(Point<? extends String,? extends String> p){
        System.out.println("x "+p.getX()+" y "+p.getY());
    }
}
