package hackerrank;

public class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int elevation = 0;
        int valleys = 0;
        for(int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                elevation -= 1;
            }
            if(path.charAt(i) == 'U') {
                elevation += 1;
            }
            if(path.charAt(i) == 'U' && elevation == 0) {
                valleys ++;
            }
        }
        return valleys;
    }
}
