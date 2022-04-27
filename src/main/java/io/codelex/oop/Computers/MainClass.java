package io.codelex.oop.Computers;

public class MainClass {
    public static void main(String[] args) {
        Computer firstPC = new Computer("Ryzen 3", "8GB", "RTX3080", "Asus", "RogStrigX1");
        Computer secondPC = new Computer("Ryzen 5", "16GB", "RTX3070", "Gigabyte", "RogStrigX2");
        Computer thirdPC = new Computer("Ryzen 3", "8GB", "RTX3080", "Asus", "RogStrigX1");
        Laptops firstLaptop = new Laptops("Intel i7", "8GB", "RX6900", "HP", "ProBook", "12V");
        Laptops secondtLaptop = new Laptops("Intel i7", "8GB", "RX6900", "HP", "ProBook", "8V");

        System.out.println(firstPC.equals(thirdPC));
        System.out.println(secondPC.getGraphicCard());
        System.out.println(firstPC.getCompany());
        System.out.println(firstLaptop.getBattery());
        System.out.println(firstLaptop.getGraphicCard());
        System.out.println(firstLaptop.equals(secondtLaptop));
        System.out.println(firstLaptop.getGraphicCard());
    }
}
