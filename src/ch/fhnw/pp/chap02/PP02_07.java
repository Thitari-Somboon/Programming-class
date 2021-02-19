package ch.fhnw.pp.chap02;

import java.util.Scanner;

/*
Write a program that prompts for and reads integer values for
speed and distance traveled, then prints the time required for the
trip as a floating point result.
 */
public class PP02_07 {
    public static void main(String[] args) {
        int speed, distance;
        float timeRequired;
        Scanner scan = new Scanner(System.in);
        System.out.println("Speed");
        speed = scan.nextInt();
        System.out.println("Distance");
        distance = scan.nextInt();
        scan.close();
        timeRequired = (float) distance/speed;
        System.out.println("Time elapse " + timeRequired);
    }
}
