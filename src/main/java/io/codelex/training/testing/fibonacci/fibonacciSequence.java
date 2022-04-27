package io.codelex.training.testing.fibonacci;

public class fibonacciSequence {

    private int getNumber(int index) {

        // return index <= 2 ? index - 1 : getFibonacciNumber(index - 1) + getFibonacciNumber(-2);

        if (index == 1) {
            return 0;
        } else if (index == 2) {
            return 1;
        } else {
            return getNumber(index - 1) + getNumber(index - 2);
        }
    }
}
