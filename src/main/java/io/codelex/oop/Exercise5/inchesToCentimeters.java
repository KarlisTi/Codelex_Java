package io.codelex.oop.Exercise5;

import java.math.BigDecimal;

public class inchesToCentimeters extends UnitConverter {

    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal(2.54);
    }
}
