package com.driver;
public class Main {
    public static void main(String[] args) {
        // Task 2: Creating an object of the Product class
        Product p = new Product();

        // Task 3: Calling the method with two int parameters
        int result1 = p.product(2,3);
        System.out.println("Product of 2 and 3 is: " + result1);

        // Task 4: Calling the method with three int parameters
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4 is: " + result2);

        // Task 5: Calling the method with two double parameters
        double result3 = p.product(2.5, 3.0);
        System.out.println("Product of 2.5 and 3.0 is: " + result3);
    }
}

class Product {
    // Task 3: Method with two int parameters
    public int product(int x, int y) {
        return x * y;
    }

    // Task 4: Overloaded method with three int parameters
    public int product(int x, int y, int z) {
        return x * y * z;
    }

    // Task 5: Overloaded method with two double parameters
    public double product(double x, double y) {
        return x * y;
    }
}


