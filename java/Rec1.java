package com.company;

import java.util.ArrayList;
import java.util.List;

public class Rec1 {

    public static void rec3(int z) {
        System.out.println("rec3");
        int x = 1;
        int y = x / z;
    }

    public static void rec2() {
        rec3(0);
        System.out.println("rec2");
    }

    public static void rec1() {
        rec2();
        rec3(1);
        System.out.println("rec1");
    }

    public static void recu() {
        recu();
    }

    public static void main(String[] args) {
//        recu();
//        rec1();
        System.out.println("after rec 1");

        List list1 = new ArrayList();
        while (true) {
            list1.add(19999.99);
        }
    }



}
