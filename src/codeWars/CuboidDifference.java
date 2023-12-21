package codeWars;

public class CuboidDifference {

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

        int firstCuboidVolume = 1;
        int secondCuboidVolume = 1;

        for (int i = 0; i < firstCuboid.length; i++) {
            firstCuboidVolume = firstCuboid[i] * firstCuboidVolume;
            secondCuboidVolume = secondCuboid[i] * secondCuboidVolume;
        }

        int difference = firstCuboidVolume - secondCuboidVolume;

        return Math.abs(difference);
    }

}

/**
 *
 * Check out this solution:
 *
 *      return Math.abs(a[0] * a[1] * a[2] - b[0] * b[1] * b[2]);
 *
 * */
