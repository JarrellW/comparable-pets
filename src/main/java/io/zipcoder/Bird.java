package io.zipcoder;

public class Bird extends Pet implements Comparable<Pet>{
    public Bird(String name) {
        super(name);
    }

    public String speak(){
        return "Chirp";
    }
}
