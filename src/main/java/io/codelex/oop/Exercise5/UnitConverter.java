package io.codelex.oop.Exercise5;

import java.math.BigDecimal;

abstract class UnitConverter implements Converter {

    public BigDecimal converValue(BigDecimal value) {
        return value.multiply((getCoefficient()));
    }

    protected abstract BigDecimal getCoefficient();
}
