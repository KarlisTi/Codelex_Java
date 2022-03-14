package io.codelex.classesandobjects.practice.videostore;


import java.io.ObjectStreamException;
import java.util.ArrayList;

public class VideoStore extends Video {

    private ArrayList<Object> names;

    public VideoStore() {
        this.names = new ArrayList<Object>();

    }

    public ArrayList<Object> getNames() {
        return names;
    }

    public void setNames(ArrayList<Object> names) {
        this.names = names;
    }


}


