package ch.fhnw.pp.chap02;

import java.util.Scanner;

/*
Write a program that reads two floating point numbers and
prints their sum, difference, and product.
 */
public class PP02_03 {
    public static void main(String[] args) {
        float i, j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        i = scan.nextFloat();
        j = scan.nextFloat();
        scan.close();
        System.out.println("Total amount = " + (i+j));
        System.out.println("Diff amount = " + (i-j));
        System.out.println("Product amount " + (i*j));
    }
}
