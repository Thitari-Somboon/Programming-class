package ch.fhnw.chap.C03;

import java.text.NumberFormat;
import java.util.Scanner;

/*
Calculates the final price of a purchased item using values
entered by the user
 */
public class C03_04Purchase {
    public static void main(String[] args) {
        final double TAX_RATE = 0.06; // 6% sales tax

        int quantity;
        double subtotal, tax, totalCost, unitPrice;

        Scanner scan = new Scanner(System.in);
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance(); //CHF
        NumberFormat fmt2 = NumberFormat.getPercentInstance(); //%

        System.out.print("Enter the quantity: ");
        quantity = scan.nextInt();

        System.out.print("Enter the unit price: ");
        unitPrice = scan.nextDouble();

        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;

        // Print output with appropriate formatting
        System.out.println("Subtotal: " + fmt1.format(subtotal)); //10*150 CHF
        System.out.println("Tax: "+ fmt1.format(tax) + " at " + fmt2.format(TAX_RATE));
        System.out.println("Total: " + fmt1.format(totalCost));
    }
}
