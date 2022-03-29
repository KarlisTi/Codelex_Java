package io.codelex.classesandobjects.practice.training.chainLink;

public class link {
    private String value;

    private link nextlink;

    public String getValue() {
        return value;
    }

    public void setVlaue(String value) {
        this.value = value;
    }

    public link getNextlink() {
        return nextlink;
    }

    public void setNextlink(link nextlink) {
        this.nextlink = nextlink;
    }

    public link(String value) {
        this.value = value;
        this.nextlink = nextlink;
    }
}
