package com.bootcoding.src.Method;

import java.util.Scanner;

public class Calcu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int x = sc.nextInt();
        System.out.println("Enter any another Number:");
        int y = sc.nextInt();
        add(x, y);
        sub(x, y);
    }

    public static void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition is " + c);
    }

    public static void sub(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction is " + c);
    }
}
