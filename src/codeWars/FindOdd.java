package codeWars;

public class FindOdd {
    public static void main(String[] args) {
        System.out.println(findIt(numbers));
        System.out.println(findIt(numbers1));
        System.out.println(findIt(numbers2));

        System.out.println("\nTrying it with two nested for loops\n");
        System.out.println(findIt2(numbers));
        System.out.println(findIt2(numbers1));
        System.out.println(findIt2(numbers2));
    }


    private static int[] numbers = {0, 1, 0, 1, 0};
    private static int[] numbers1 = {1,2,2,3,3,3,4,3,3,3,2,2,1};
    private static int [] numbers2 = {1, 1, 2};

    public static int findIt(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        int counter = 0;
        int index = 0;
        do {
            for(int i = 0; i < a.length; i ++) {
                if (a[index] == a[i]) {
                   counter += 1;
                }
            }
            if (counter % 2 != 0) {
                break;
            }
            index ++;
        }while (index < a.length);
        return a[index];

    }

    /**
     * Same output as above, however this one was done with two nested for loops
     * The first loop, index i, stays at the current index, while index j iterates through all the
     * indices of a.length, then i would move from index 0 to index 1...
     * At this point, j loop would start again, and so forth until i reaches its condition: a.length
     * */
    public static int findIt2(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        int counter = 0;
        int indexValue = 0;
        for (int i = 0; i < a.length; i++) { // Loop starts at index 0, then inner loop executes.
            for (int j = 0; j < a.length; j++) { // Inner loop completes, then outer loop moves up an index.  Inner loop begins again at index 0, unless indicated otherwise.
                if (a[i] == a[j]) {
                    counter ++;
                }
            }
            if (counter % 2 != 0) {
                indexValue = a[i];
                break;
            }

        }
        return indexValue;
    }

}
