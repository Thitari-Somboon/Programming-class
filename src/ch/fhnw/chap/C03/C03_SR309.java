package ch.fhnw.chap.C03;
/*
Write a declaration for a String variable called front,
and initialize it to the first 10 characters
of another String object called description .
 */
public class C03_SR309 {
    public static void main(String[] args) {
        String front = "Thitari is a BIT student in FHNW";
        System.out.println(front.substring(0,11));
    }
}
