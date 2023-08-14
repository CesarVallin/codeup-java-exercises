package hackerrank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PlusMinus {
    private static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > 0) {
                positives += 1;
            }
            if(arr.get(i) < 0) {
                negatives += 1;
            }
            if(arr.get(i) == 0) {
                zeros += 1;
            }
        }
        System.out.format("%.6f%n", (double) positives/arr.size());
        System.out.format("%.6f%n", (double) negatives/arr.size());
        System.out.format("%.6f%n", (double) zeros/arr.size());

    }
    private static void plusMinus1 (List<Integer> arr) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (Integer e: arr) {
            if(e < 0) {
                positives += 1;
            }
            if (e > 0) {
                negatives += 1;
            }
            if (e == 0) {
                zeros += 1;
            }
        }
        System.out.format("%.6f%n", (double) positives/arr.size());
        System.out.format("%.6f%n", (double) negatives/ arr.size());
        System.out.format("%.6f%n", (double) zeros/ arr.size());
    }
    private static void plusMinus2(List<Integer> arr) {
        Iterator<Integer> iterator = arr.iterator();
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        while (iterator.hasNext()) {
            /** Very important step here, remember, iterator.next() gets you the next element in a collection...
             * However, treat it like the scanner class... otherwise you are only graving the first element, then
             * jumping all the way down to the last time you called the iterator.next() object.
             * */
            int nextElement = iterator.next();
            System.out.println(nextElement);
            if(nextElement > 0) {
                positives += 1;
            }
            if(nextElement < 0) {
                negatives += 1;
            }
            if(nextElement == 0) {
                zeros += 1;
            }
        }
        System.out.format("%.6f%n", (double) positives/arr.size());
        System.out.format("%.6f%n", (double) negatives/arr.size());
        System.out.format("%.6f%n", (double) zeros/arr.size());

    }
    private static void plusMinus3(List<Integer> arr) {
        int positives = (int) arr.stream().filter(element -> element > 0).count();
//        System.out.println(positives);
        int negatives = (int) arr.stream().filter(element -> element < 0).count();
//        System.out.println(negatives);
        int zeros = (int) arr.stream().filter(element -> element == 0).count();
//        System.out.println(zeros);
        System.out.format("%.6f%n", (double) positives/arr.size());
        System.out.format("%.6f%n", (double) negatives/arr.size());
        System.out.format("%.6f%n", (double) zeros/arr.size());
    }



    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, -4, 3, -9, 0, 4, 1);

        System.out.println("Using regular loop ------------------------");
        plusMinus(arrayList);
        System.out.println("Using spicy loop---------------------------");
        plusMinus1(arrayList);
        System.out.println("Using Iterator object to loop---------------------------");
        plusMinus2(arrayList);
        System.out.println("Getting fancy ----------------------------------");
        plusMinus3(arrayList);



    }

}
