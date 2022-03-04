package io.codelex.arithmetic.practice;

public class Produt1ToN {
    public static void main(String[] args) {
        int productNum = 1;
        for (int i = productNum; i < 10; i++) {
            productNum *= i;
        }
        System.out.println(productNum);
    }
}
