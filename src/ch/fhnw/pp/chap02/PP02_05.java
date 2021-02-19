package ch.fhnw.pp.chap02;

import java.util.Scanner;

/*
Create a version of the TempConverter application to convert
from Fahrenheit to Celsius. Read the Fahrenheit temperature
from the user.
 */
public class PP02_05 {
    public static void main(String[] args) {
        double f ,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temp in F");
        f = scan.nextDouble();
        scan.close();
        c = (f-32)/1.8;
        System.out.println(f + "F = " + c + "C");
    }
}
