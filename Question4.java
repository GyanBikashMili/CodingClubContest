package com.gyan;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(Math.max(a,Math.max(b,Math.max(c,d))));


    }
}
