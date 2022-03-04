package io.codelex.Loops;

public class Exercise4 {
    public static void main(String[] args) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        for(char i = 0; i < vowels.length; ++i) {
            System.out.println(vowels[i]);
        }

        char[] var6 = vowels;
        int var3 = vowels.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            char vowel = var6[var4];
            System.out.println(vowel);
        }

    }
}
