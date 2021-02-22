package ch.fhnw.pp.pp03;

import java.util.Scanner;

/*
Write a program that reads a floating point value (double ) and
prints the closest whole numbers less than and greater than thatvalue.
For example, if the number is 28.466, the program would
print 28 and 29.
 */
public class PP03_04FloatingNumbers {
    public static void main(String[] args) {
        double num1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter floating number: ");
        num1 = scan.nextDouble();
        scan.close();

        System.out.println("Rounded number less: " + (int)(Math.floor(num1)));
        System.out.println("Rounded number greater: " + (int)(Math.ceil(num1)));
    }
}
