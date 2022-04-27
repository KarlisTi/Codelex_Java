package io.codelex.oop.Exercise5;

public enum ConversionType {

    METERS_TO_YARDS(new MeterToJardConverter()),
    YARDS_TO_METERS(new YardsToMeters()),
    CENTIMETERS_TO_INCHES(new CenimeterToInches()),
    INCHES_TO_CENTIMETERS(new inchesToCentimeters()),
    KILOMETERS_TO_MILES(new KillometerToMiles()),
    MILES_TO_KILOMETERS(new MilesToKillometers());

    public Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }
}
