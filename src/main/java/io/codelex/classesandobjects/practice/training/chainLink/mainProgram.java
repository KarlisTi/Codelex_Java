package io.codelex.classesandobjects.practice.training.chainLink;

public class mainProgram {
    public static void main(String[] args) {

        link l1 = new link("John");
        link l2 = new link("Tom");
        link l3 = new link("Anna");

        chain chain = new chain(l1);
        chain.addlink(l2);
        chain.addlink(l3);


    }
}
