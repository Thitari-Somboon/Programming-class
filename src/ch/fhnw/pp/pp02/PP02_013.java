package ch.fhnw.pp.pp02;

import java.util.Scanner;

/*
 Write a program that prompts for and reads the numerator and
denominator of a fraction as integers, then prints the decimal
equivalent of the fraction.
 */
public class PP02_013 {
    public static void main(String[] args) {
        int numerator, denominator;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter numerator");
        numerator = scan.nextInt();
        System.out.print("Enter denominator");
        denominator = scan.nextInt();
        scan.close();

        double fraction = (double) numerator/denominator;
        System.out.println(fraction);
    }
}
