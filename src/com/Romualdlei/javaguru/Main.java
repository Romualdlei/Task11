package com.Romualdlei.javaguru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(74 + 36);

        System.out.println(50 / 10);

        Scanner in = new Scanner(System.in);

       System.out.print("Input first number: ");
       int num1 = in.nextInt();

       System.out.print("Input second number: ");
       int num2 = in.nextInt();

       System.out.println(num1 + " + " + num2 + " =" + (num1 + num2) );

       System.out.println(num1 + " - " + num2 + " =" + (num1 - num2) );

       System.out.println(num1 + " x " + num2 + " =" + (num1 * num2) );

       System.out.println(num1 + " / " + num2 + " =" + (num1 / num2) );
    }
}