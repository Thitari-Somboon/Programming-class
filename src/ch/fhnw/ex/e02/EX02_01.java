package ch.fhnw.ex.e02;

import java.util.Scanner;

public class EX02_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        String usernameEnter = scan.nextLine();
        System.out.println("Hello "+usernameEnter);
    }
}
