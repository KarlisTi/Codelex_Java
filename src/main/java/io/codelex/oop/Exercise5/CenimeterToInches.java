package io.codelex.oop.Exercise5;

import java.math.BigDecimal;

public class CenimeterToInches extends UnitConverter {

    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal(0.393700787);
    }
}
