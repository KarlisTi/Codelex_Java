package io.codelex.JavaAdvancedTest.Exercise3;

public class Joiner<T> {

    private String seperator;


    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    public String joinWithSeperator(T value) {
        String newString = String.valueOf(value);
        String[] splitString = newString.split("");
        String joinedString = String.join(this.seperator, splitString);
        return joinedString;
    }
}
