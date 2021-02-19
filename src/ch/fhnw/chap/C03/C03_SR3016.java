package ch.fhnw.chap.C03;

import java.util.Random;

/*
Given a Random object called rand,
what does the call rand.nextint ()
return?
 */
public class C03_SR3016 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1;
        num1= rand.nextInt();
        System.out.println("A random integer: "+ num1);

        num1 = rand.nextInt(20);
        System.out.println("From 0 to 19: " + num1);
    }
}
