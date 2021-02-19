package ch.fhnw.chap.C03;

import java.util.Random;

/*
Assuming that a Rand om object has been created called generator,
what is the range of the result of each of the following expressions?

 */
public class C03_SR3018 {
    public static void main(String[] args) {
        Random generator = new Random();
        int num1;
        num1 = generator.nextInt(50);
        System.out.println("From 0 to 49: " + num1);

        num1 = generator.nextInt(5) +10;
        System.out.println("From 10 to 14: " + num1);

        num1 = generator.nextInt(10) +5;
        System.out.println("From 5 to 14: " + num1);

        num1 = generator.nextInt(50) - 25;
        System.out.println("From -25 to 24: " + num1);
    }
}
