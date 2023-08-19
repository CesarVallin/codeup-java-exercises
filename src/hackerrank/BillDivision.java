package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BillDivision {

    public static void main(String[] args) {
        Collections.addAll(bill, 3, 10, 2, 9);

        bonAppetit(bill, 1, 12);
    }

    /** Create static List */
    private static List<Integer> bill = new ArrayList<>();
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        // Anna declines to eat k
        // b is the amount of money that Anna contributed to the bill

        int totalBill = 0;
        int annasTotal =0;

        for (int i = 0; i < bill.size(); i++){

            /** Total bill */
            totalBill += bill.get(i);
            /** Everything except the element Anna doesn't eat */
            if (bill.get(k) != bill.get(i)) {
                annasTotal += bill.get(i);
            }
        }

        if (annasTotal / 2 == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println((totalBill/2) - (annasTotal/2));
        }

    }
}
