package io.codelex.classesandobjects.practice.training.chainLink;

public class chain {

    private link firstLink;

    public link getFirstLink() {
        return firstLink;
    }

    public chain(link firstLink) {
        this.firstLink = firstLink;
    }

    public void addlink(link newlink) {
        newlink.setNextlink(firstLink);
        this.firstLink = newlink;
    }

    public void printOut() {
        link currentLink = firstLink;
        System.out.println(currentLink.getValue());
        while (currentLink.getNextlink() != null) {
            System.out.println(currentLink.getNextlink().getValue());
            currentLink = currentLink.getNextlink();
        }
    }
}
