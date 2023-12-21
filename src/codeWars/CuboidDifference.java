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

