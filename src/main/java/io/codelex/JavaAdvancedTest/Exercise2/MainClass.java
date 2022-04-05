package io.codelex.JavaAdvancedTest.Exercise2;


public class MainClass {
    public static void main(String[] args) throws BasketFullException {

        Basket<Apple> newAppleBasket = new Basket<>();
        Apple newApple = new Apple();

        try {
            for (int i = 0; i < 11; i++) {
                newAppleBasket.addToBasket(newApple);
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        try {
            for (int i = 0; i < 11; i++) {
                newAppleBasket.removeFromBasket(newApple);
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }


        Basket<Mushroom> newMushroomBasket = new Basket<>();
        Mushroom newMushroom = new Mushroom();


        try {
            for (int i = 0; i < 11; i++) {
                newMushroomBasket.addToBasket(newMushroom);
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        try {
            for (int i = 0; i < 11; i++) {
                newMushroomBasket.removeFromBasket(newMushroom);
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }

    }
}
