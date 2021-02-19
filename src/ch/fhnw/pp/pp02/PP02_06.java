package ch.fhnw.pp.pp02;

import java.util.Scanner;

/*
Write a program that converts miles to kilometers. (One mile
equals 1.60935 kilometers.) Read the miles value from the user
as a floating point value.
 */
public class PP02_06 {
    public static void main(String[] args) {
        final double KM_NUM = 1.60935;
        double milesNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles");
        milesNum = scan.nextDouble();
        scan.close();
        System.out.println(milesNum+ " miles = "+milesNum*KM_NUM + "km");
    }
}
