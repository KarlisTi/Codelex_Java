package io.codelex.flowcontrol;

public class Exercise4 {
    public static void main(String[] args) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        for(char i = 0; i < vowels.length; ++i) {
            System.out.println(vowels[i]);
        }

        System.out.println();

        for(char j : vowels)  {
            System.out.println(j);
        }

    }
}
