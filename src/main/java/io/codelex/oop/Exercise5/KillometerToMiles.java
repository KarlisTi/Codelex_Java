package io.codelex.oop.Exercise5;

import java.math.BigDecimal;

public class KillometerToMiles extends UnitConverter {


    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal(0.621371192);

    }
}
