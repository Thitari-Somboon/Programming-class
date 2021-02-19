package ch.fhnw.chap.C03;

import java.util.Random;

/*
Assuming that a Random object has been created called generator,
write expressions that generate each of the following ranges of integers, including the endpoints. Use the version of the next I nt method
that accepts a single integer parameter.
 */
public class C03_SR3019 {
    public static void main(String[] args) {
        Random generator = new Random();
        int num1;

        num1 = generator.nextInt(31);
        System.out.println("From 0 to 30: " + num1);

        num1 = generator.nextInt(20) + 10;
        System.out.println("From 10 to 19: " + num1);

        num1 = generator.nextInt(11) -5;
        System.out.println("From -5 to 5: " + num1);
    }
}
