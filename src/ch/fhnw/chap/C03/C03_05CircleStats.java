package ch.fhnw.chap.C03;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Calculates the area and circumference of a circle given its radius.
 */
public class C03_05CircleStats {
    public static void main(String[] args) {
        int radius;
        double area, circumference;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the circle´s radius: ");
        radius = scan.nextInt();

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;

        // Round the output to three decimal places
        DecimalFormat fmt = new DecimalFormat("0.###");

        System.out.println("The circle's area: " + fmt.format(area));
        System.out.println("The circle's circumference: " + fmt.format(circumference));
    }
}
