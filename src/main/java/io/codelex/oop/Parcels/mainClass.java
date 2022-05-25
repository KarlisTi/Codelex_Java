package io.codelex.oop.Parcels;

public class mainClass {
    public static void main(String[] args) {
        Parcel firstObject = new Parcel(100, 100, 100, 30);
        firstObject.validate();
        checkWeight();
    }

    static void checkWeight() {
        if (!Parcel.isExpress) {
            System.out.println("Parcel weight is to hight");
        }

    }
}
