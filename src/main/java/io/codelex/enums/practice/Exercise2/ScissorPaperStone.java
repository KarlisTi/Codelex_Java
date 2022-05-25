package io.codelex.enums.practice.Exercise2;

public enum ScissorPaperStone {
    SCISSOR,
    PAPER,
    STONE;

    public String toString() {
        switch (this) {
            case STONE:
                return "STONE";
            case PAPER:
                return "PAPER";
            case SCISSOR:
                return "SCISSOR";
            default:
                throw new IllegalArgumentException();
        }
    }


}
