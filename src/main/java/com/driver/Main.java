package com.driver;


class Product {
    // Task 3: Method with two int parameters
    static int product(int x, int y) {
        return x*y;
    }

    static int product(int x, int y, int z)
    {
        return x * y * z;
    }

    static double product(double x, double y) {
        return x * y;
    }
}
public class Main {
    public static void main(String[] args) {

        Product p = new Product();

        System.out.println(p.product(2,3));

        System.out.println(p.product(2, 3, 4));

        System.out.println(p.product(2.5, 3.0));

    }
}



