package com.company;

public class Main {

    public static void sayHello(String fname) {
        System.out.println(String.format("Hello %s Doe", fname));
        sayHello(fname, "Doe");
    }

    public static void sayHello(String fname, String lname) {
        System.out.println(String.format("Hello %s %s", fname, lname));
    }

    public static float getDollarInShekels(float shekels, float usdCurrency) {
        return shekels * usdCurrency;
    }

    public static float getDollarInShekels(float shekels) {
        float usdCurrency = getFromRESTAPI();
        return shekels * usdCurrency;
    }

    private static float getFromRESTAPI() {
        return 0;
    }

    public static void main(String[] args) {
	    sayHello("Danny");
	    sayHello("Danny", "Shovevany");
    }
}
