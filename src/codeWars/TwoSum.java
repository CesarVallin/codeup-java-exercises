package codeWars;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {

        int[] result = null;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i +1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    result = new int[]{i, j};
                }
            }
        }

        return result;
    }
}

/**
 * Check out how you tested it on the Test class:
 *
 *         System.out.println(Arrays.toString(TwoSum.twoSum(numbers, 4)));
 * */


/**
 * Check out this solution:
 *
 * Another approach:
 *      - Start by declaring and initializing the array with two indices.
 *      int[] result = new int[2];
 *
 *      - Nested inside the double loops, the code block within your conditional statement:
 *      result[0] = i;
 *      result[1] = j;
 * */
