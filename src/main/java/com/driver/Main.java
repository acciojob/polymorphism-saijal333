package com.driver;

public class Main {
public static void main(String[] args){
    Product p = new Product();
    int result1 = p.product(5,3);
    System.out.println("Product of two integers: " + result1);

    int result2 = p.product(2,4,3);
    System.out.println("Product of three integers: " + result2);

    double result3 = p.product(2.5, 3.0);
    System.out.println("Product of two doubles: " + result3);

     }
    }

    class Product{
    public int product(int x, int y){
        return x*y;
    }
    public int product(int x, int y, int z){
        return x*y*z;
    }
    public double product(double x, double y){
        return x*y;
    }
    }