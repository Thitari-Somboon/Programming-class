package ch.fhnw.chap.C03;
/*
What output is produced by the following code fragment?
 */
public class C03_SR307 {
    public static void main(String[] args) {
        String s1 = "Foundations";
        String s2;
        System.out.println(s1.charAt(1));
        s2 = s1.substring(0,5); //Ending with index 5-1
        System.out.println(s2);
        System.out.println(s1.length()); //11
        System.out.println(s2.length()); //5
    }
}
