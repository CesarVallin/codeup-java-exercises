package codeWars;

public class FindOdd {
    public static void main(String[] args) {
        System.out.println(findIt(numbers));
        // expected answer is 0;
        System.out.println(findIt(numbers1));
        System.out.println(findIt(numbers2));
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

}
