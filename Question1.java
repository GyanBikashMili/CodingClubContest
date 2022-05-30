package com.gyan;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 454;
        int r;
        int temp = n;
        int sum = 0;
        while(n>0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

}
