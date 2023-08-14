package com.driver;

public class Main {
    static class Product{
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
    public static void main(String[] args) {
        Product p = new Product();
        int result1 = p.product(5, 3);
        System.out.println("Product result 2 parameters: " + result1);

        int result2 = p.product(2,4,5);
        System.out.println("Product result 3 parameters: " + result2);

        double result3 = p.product(2.5, 3.5);
        System.out.println("Product result(double): " + result3);
    }
    }
