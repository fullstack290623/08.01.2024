package com.company;

public class rec_q {

    private static int add_rec(int number1, int number2) {
        if (number2 <= 0)
            return number1;
        return add_rec(number1 + 1, number2 - 1);
    }

    private static void print_countdown(int number) {
        if (number < 0)
            return;
        System.out.println(number--);
        print_countdown(number);
    }

    public static void main(String[] args) {
        int number = 5;
        print_countdown(number);

        System.out.println(add_rec(5, 3));
    }

    // print_files('c:\games')
    //    1.txt, 2.txt >fortnite-12 >assassin-creed-19 >underground-2 >need4speed-3
    // print_files('c:\games\fortnite-12')

    // 1. create recursive function that calculates a - b
    // 1. create recursive function that calculates a * b



}
