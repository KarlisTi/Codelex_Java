package io.codelex.training.Humans;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 32, "money");
        Hero hero2 = new Hero("Superman", 36, "strengths");

        System.out.println(hero2.name);
        System.out.println(hero2.age);
        System.out.println(hero2.power);
    }
}