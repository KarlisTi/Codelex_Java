package io.codelex.oop.Exercise5;

import java.math.BigDecimal;

public class MeterToJardConverter extends UnitConverter {


    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal(1.0936133);

    }
}
