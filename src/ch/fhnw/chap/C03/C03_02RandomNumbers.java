package ch.fhnw.chap.C03;

import java.util.Random;

/*
 Generates random numbers in various ranges.
 */
public class C03_02RandomNumbers {
    public static void main(String[] args) {
        Random generator = new Random();
        int num1;
        float num2;

        num1 = generator.nextInt();
        System.out.println("A random integer: " + num1);

        num1 = generator.nextInt(10);
        System.out.println("From 0 to 9: " + num1); //0-9

        num1 = generator.nextInt(10) + 1;
        System.out.println("From 1 to 10:" + num1); //1 till (10+1)-1

        num1 = generator.nextInt(15) + 20; //20 till (20+15)-1
        System.out.println("From 20 to 34: "+ num1);

        num1 = generator.nextInt(20)-10; //-10 till (-10+20)-1
        System.out.println("From -10 to 9: " +num1);

        num2 = generator.nextFloat();
        System.out.println("A random float (between 0-1 ): " + num2);

        num2 = generator.nextFloat()*6; //0.00 to 5.99999
        num1 = (int)num2 +1 ; //1 till (6+1)-1
        System.out.println("From 1 to 6: " + num1);
    }
}
