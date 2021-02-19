package ch.fhnw.pp.pp02;

import java.util.Scanner;

/*
Write a program that reads three integers and prints their average.
 */
public class PP02_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number");
        int num1 = scan.nextInt();
        System.out.print("Enter second number");
        int num2 = scan.nextInt();
        System.out.print("Enter third number");
        int num3 = scan.nextInt();
        scan.close();
        double averageThreeNumbers = (double)(num1+num2+num3)/3;
        System.out.println("Average is = " + averageThreeNumbers);

    }
}
