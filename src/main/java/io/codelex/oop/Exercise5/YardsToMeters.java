package io.codelex.oop.Exercise5;

import java.math.BigDecimal;

public class YardsToMeters extends UnitConverter {

    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal(0.9144);

    }
}
