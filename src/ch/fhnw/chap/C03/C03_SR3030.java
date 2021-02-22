package ch.fhnw.chap.C03;
/*
Suppose that an enumerated type called CardSuit has been defined as
follows:
 */
public class C03_SR3030 {
    enum CardSuit {clubs , diamonds, hearts, spades}

    public static void main(String[] args) {
        CardSuit card1, card2;

        card1 = CardSuit.clubs;
        card2 = CardSuit.hearts;
        System.out.println(card1);
        System.out.println(card1.ordinal());
        System.out.println(card2.ordinal());
    }
}
