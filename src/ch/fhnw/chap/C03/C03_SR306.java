package ch.fhnw.chap.C03;



/*
Assume s1, s2, and s3 are String variables initialized to "Amanda",
"Bobby ", and "Chris". respectively. Which String variable or
variables are changed by each of the following statements?
 */
public class C03_SR306 {
    public static void main(String[] args) {
        String s1 = "Amanda", s2 = "Bobby", s3 = "Chris";
        System.out.println ("S1 "+ s1);
        System.out.println();
        s1 = s3.toLowerCase();
        System.out.println("Lowercase " +s1);
        System.out.println();
        System.out.println("Replace " + s2.replace('B', 'M'));
        System.out.println();
        s3 = s2.concat(s1);
        System.out.println("Concat "+ s3);
    }
}
