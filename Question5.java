package com.gyan;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

                int rows = 4;

                for (int i=1; i<=rows; i++)
                {
                    for (int j=1; j<i; j++)
                    {
                        System.out.print(" ");
                    }
                    
                    for (int k=rows; k>=i; k--)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                in.close();
            }
        }

