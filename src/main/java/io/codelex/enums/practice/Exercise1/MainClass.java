package io.codelex.enums.practice.Exercise1;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("|" + "Direction" + " |" + "Text" + " | ");
        System.out.println("|" + "  ---" + "  |" + " ---" + "    | ");
        System.out.println("| " + CardinalPoints.NORTH + " | " + CardinalPoints.NORTH.directions + " | ");
        System.out.println("| " + CardinalPoints.SOUTH + " | " + CardinalPoints.SOUTH.directions + " |");
        System.out.println("| " + CardinalPoints.EAST + "  | " + CardinalPoints.EAST.directions + "|");
        System.out.println("| " + CardinalPoints.WEST + "  | " + CardinalPoints.WEST.directions + "| ");

    }
}
