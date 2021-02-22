package ch.fhnw.pp.pp03;

import java.util.Scanner;

/*
Write a program that prints the sum of cubes.
Prompt for and read two integer values
and print the sum of each value raised to the third power.
 */
public class PP03_02SumOfCubes {
    public static void main(String[] args) {
        int num1, num2, sum;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        num2 = scan.nextInt();
        scan.close();

        sum = (int)(Math.pow(num1, 3) + Math.pow(num2, 3));
        System.out.println("Total: " + sum);

    }
}
