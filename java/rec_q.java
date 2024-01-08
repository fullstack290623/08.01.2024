package com.company;

public class rec_q {

    private static int add_rec(int number1, int number2) {
        if (number2 <= 0)
            return number1;
        return add_rec(number1 + 1, number2 - 1);
        // add(8, 4)
        //   return add(9, 3)
        //     return add(10, 2)
        //       return add(11, 1)
        //         return add(12, 0)

    }

    private static void print_countdown(int number) {
        if (number < 0)
            return;
        System.out.println(number--);
        print_countdown(number);
    }

    public static int mul_rec(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a + mul_rec(a, b - 1);
        // mul(8, 4)
        // 8 + mul(8, 3) = 32
        //     8 + mul(8, 2) = 24
        //          8 + mul(8, 1) = 16
        //              8 + mul (8, 0) = 8
        //                       0
    }

    public static void main(String[] args) {
        int number = 5;
        print_countdown(number);

        var x = mul_rec(8, 4);
        System.out.println(x);

        System.out.println(add_rec(5, 3));
    }

    // print_files('c:\games')
    //    1.txt, 2.txt >fortnite-12 >assassin-creed-19 >underground-2 >need4speed-3
    // print_files('c:\games\fortnite-12')

    // 1. create recursive function that calculates a - b
    // 2. create recursive function that calculates a * b



}
