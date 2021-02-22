package ch.fhnw.pp.pp03;

import java.util.Random;

/*
Write a program that generates a random password that meets
certain criteria.
The password should start with 7 or 8 or 9, and
the next five digits can be any digit from O to 9.
This should be followed by a dash (-)
and then three random uppercase letters.
Hint: The integers from 65 to 90 represent the uppercase letters
from A to Z. You can cast an integer to a char type like this:
(char)65 is 'A' and (char)66 is 'B'.
 */
public class PP03_03RandomPassword {
    public static void main(String[] args) {
        String passwordResult = "";

        Random generator = new Random();
        //1st digit
        passwordResult += generator.nextInt(3) + 7; //From 7 to 9

        //2nd digit
        passwordResult += generator.nextInt(10); //From 0 to 9

        //3rd digit
        passwordResult += generator.nextInt(10); //From 0 to 9

        //4th digit
        passwordResult += generator.nextInt(10); //From 0 to 9
        //5th digit
        passwordResult += generator.nextInt(10); //From 0 to 9

        passwordResult += "-";

        //3 uppercase letter
        passwordResult += (char)(generator.nextInt(26)+ 65 );
        passwordResult += (char)(generator.nextInt(26)+ 65 );
        passwordResult += (char)(generator.nextInt(26)+ 65 );

        System.out.println("A random password is: " + passwordResult);
    }
}
