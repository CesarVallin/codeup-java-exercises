package codeWars;

public class FindOdd {
    public static void main(String[] args) {
        System.out.println(findIt(numbers));
        System.out.println(findIt(numbers1));
    }


    private static int[] numbers = {0, 1, 0, 1, 0};
    private static int[] numbers1 = {1,2,2,3,3,3,4,3,3,3,2,2,1};

    public static int findIt(int[] a) {

        int counter = 0;
        int oddNum;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
//                System.out.println("a[i] = " + a[i] + "...." + " a[j] = " + a[j]);
                if (a[i] == a[j]) {
                    counter ++;
                }
            }
            if (counter % 2 != 0) {
                oddNum = a[i];
                return oddNum;
            }
        }
        return 0; // odd Number
    }

}
