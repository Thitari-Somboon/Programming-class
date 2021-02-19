package ch.fhnw.pp.pp02;

import java.util.Scanner;

/*
Write a program that prompts for and reads a person's name,
age, college, and pet's name. Then print the following paragraph,
inserting the appropriate data:
Hello, my name is name and I am age years
old. I'm enjoying my time at college, though
I miss my pet petname very much!
 */
public class PP02_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name");
        String userName = scan.nextLine();
        System.out.println("Age");
        String userAge = scan.nextLine();
        System.out.println("College");
        String userCollege = scan.nextLine();
        System.out.println("Pet name");
        String userPetName = scan.nextLine();
        scan.close();
        System.out.println("Hello, my name is " + userName + " and I am " + userAge +
                " years \nold. I'm enjoying my time at " + userCollege +", though \nI miss my "
                + userPetName + " very much!");
    }
}
