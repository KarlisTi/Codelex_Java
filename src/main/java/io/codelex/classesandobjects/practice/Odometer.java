package io.codelex.classesandobjects.practice;

public class Odometer {
   private int mileage;

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public void incraseMilage(){
        if(this.mileage < 999999){
            this.mileage +=1;
        } else{
            this.mileage = 0;
            System.out.println("Odometer reach maximum and resets current mileage");
        }
    }

    @Override
    public String toString() {
        return "Odometer{" +
                "mileage=" + mileage +
                '}';
    }
}