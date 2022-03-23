package io.codelex.enums.practice.Exercise1;

public enum CardinalPoints {
    NORTH("up", 0),
    SOUTH("down", 1),
    EAST("right", 2),
    WEST("left", 3);

    public final String directions;
    public final int number;

    CardinalPoints(String directions, int number) {
        this.directions = directions;
        this.number = number;
    }


}
