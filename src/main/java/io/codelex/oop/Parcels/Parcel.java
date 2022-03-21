package io.codelex.oop.Parcels;

public class Parcel implements Validable {


    int xLength;
    int yLength;
    int zLength;
    float weight;
    static boolean isExpress = true;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;

    }


    @Override
    public void validate() {
        if (xLength + yLength + zLength > 300) {
            System.out.println("Dimension is not valid");
        } else if (xLength < 30 && yLength < 30 && zLength < 30) {
            System.out.println("length is to low");
        } else {
            System.out.println("Dimension is legit");
        }

        if (weight > 30) {
            isExpress = false;
        } else {
            System.out.println("Weight is legit");
        }


    }
}
