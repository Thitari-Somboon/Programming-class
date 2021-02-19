package ch.fhnw.pp.pp02;

import java.util.Scanner;

/*
Create a version of the previous project that reverses the computation.
That is, read a value representing a number of centimeters,
then print the equivalent distance as a combination of kilometers,
meters, and centimeters. (For example, 1,005,020 centimeters is
equivalent to 10 kilometers, 50 meters, and 20 centimeters.)
 */
public class PP02_09 {
    public static void main(String[] args) {
        final int CM_TO_M = 100, CM_TO_KM = 100000;
        int cm, cmDistance, mDistance, kmDistance;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number in centimeters");
        cm = scan.nextInt();
        scan.close();
        kmDistance = cm/CM_TO_KM;
        mDistance = (cm-(10*CM_TO_KM))/CM_TO_M;
        cmDistance = cm -((10*CM_TO_KM)+(50*CM_TO_M));
        System.out.println(kmDistance + " km");
        System.out.println(mDistance + " m");
        System.out.println(cmDistance + " cm");
    }
}

/*
public static void main(String[] args)
    {
        final int CENTIMETRES_PER_KILOMETRE = 100000;
        final int CENTIMETRES_PER_METRE = 100;

        int centimetres, metres, kilometres;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of centimetres: ");
        centimetres = scan.nextInt();

        kilometres = centimetres / CENTIMETRES_PER_KILOMETRE;

        centimetres = centimetres % CENTIMETRES_PER_KILOMETRE;  // remaining centimetres

        metres = centimetres / CENTIMETRES_PER_METRE;

        centimetres = centimetres % CENTIMETRES_PER_METRE;  // remaining seconds

        System.out.println();
        System.out.println("Kilometres: " + kilometres);
        System.out.println("Metres: " + metres);
        System.out.println("Centimetres: " + centimetres);
    }
 */
