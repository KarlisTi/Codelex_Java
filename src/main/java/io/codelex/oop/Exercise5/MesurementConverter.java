package io.codelex.oop.Exercise5;

import java.math.BigDecimal;

public class MesurementConverter {

    public static BigDecimal convert(ConversionType type, BigDecimal value) {
        return type.converter.converValue(value);
    }
}
