package ch.fhnw.pp.pp03;


import java.util.Random;
import java.util.Scanner;

/*
Write a program that prompts for and reads the user's first and last name (separately).
Then print a string composed of the first letter of the user's first name,
followed by the first five characters of the user's last name,
followed by a random number in the range 10 to 99.
Assume that the last name is at least five letters long.
Similar algorithms are sometimes used to
generate usernames for new computer accounts.
 */
public class PP03_01FirstnameAndLastname {
    public static void main(String[] args) {
        char _1stLetter_of_fName;
        String fName, lName, _5thLetter_of_lName, username;
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter firstname: ");
        fName = scan.nextLine();
        System.out.print("Enter lastname: ");
        lName = scan.nextLine();
        scan.close();

        _1stLetter_of_fName = fName.charAt(0);
        _5thLetter_of_lName = lName.substring(0,5);
        username = _1stLetter_of_fName + _5thLetter_of_lName;

        Random generator = new Random();
        num = generator.nextInt(90) + 10; //From 10 to (10+90)-1
        System.out.println(username + num);
    }
}
