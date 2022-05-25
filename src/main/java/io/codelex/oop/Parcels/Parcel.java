package io.codelex.oop.Parcels;

public class Parcel implements Validable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    static boolean isExpress = true;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public void validate() {
        int maxDimension = 300;
        int minEachDimensionSize = 30;
        if (xLength + yLength + zLength > maxDimension) {
            System.out.println("Dimension is not valid");
        } else if (xLength < minEachDimensionSize && yLength < minEachDimensionSize 
                && zLength < minEachDimensionSize) {
            System.out.println("length is to low");
        } else {
            System.out.println("Dimension is legit");
        }

        if (weight > minEachDimensionSize) {
            isExpress = false;
        } else {
            System.out.println("Weight is legit");
        }
    }
}
