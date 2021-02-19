package ch.fhnw.pp.chap02;
import java.util.Scanner;

/*
 Write a program that reads values representing a distance in kilometers, meters, and centimeters and then prints the equivalent
total number of centimeters. (For example, 10 kilometers, 50
meters, and 20 centimeters is equivalent to 1,005,020 centimeters.)
 */
public class PP02_08 {
    public static void main(String[] args) {
        final int KM_TO_CM = 100000, M_TO_CM = 100;
        //1km = 100000cm
        //1m = 100cm
        int kmDistance, mDistance, cmDistance, convertTotal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter distance in km");
        kmDistance = scan.nextInt();
        System.out.println("Enter distance in meters");
        mDistance = scan.nextInt();
        System.out.println("Enter distance in cm");
        cmDistance = scan.nextInt();
        scan.close();
        convertTotal = ((kmDistance * KM_TO_CM) + (mDistance * M_TO_CM) + cmDistance);
        System.out.println("Total numbers in cm = " + convertTotal);
    }
}
