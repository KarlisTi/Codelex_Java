package io.codelex.JavaAdvancedTest.Exercise2;

public class Basket<T>{

    T valueOne;


    public Basket(T valueOne) {
        this.valueOne = valueOne;

    }

    public static<T extends Number> T add(T x, T y){

        if (x == null || y == null) {
            return null;
        }

        if (x instanceof Double) {
            return (T) new Double(x.doubleValue() + y.doubleValue());
        } else if (x instanceof Integer) {
            return (T)new Integer(x.intValue() + y.intValue());
        } else {
            throw new IllegalArgumentException("Type " + x.getClass() + " is not supported by this method");
        }
    }
    }
    public T removeFromBasket() {
        valueOne.



    }


}





