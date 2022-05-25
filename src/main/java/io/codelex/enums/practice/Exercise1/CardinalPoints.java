package io.codelex.enums.practice.Exercise1;

public enum CardinalPoints {
    NORTH("up", 0),
    SOUTH("down", 1),
    EAST("right", 2),
    WEST("left", 3);

    private final String directions;
    private final int number;


    CardinalPoints(String directions, int number) {
        this.directions = directions;
        this.number = number;
    }

    public String getDirections() {
        return directions;
    }

    public int getNumber() {
        return number;
    }
    
}
