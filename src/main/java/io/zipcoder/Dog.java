package io.zipcoder;

public class Dog extends Pet implements Comparable<Pet> {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Bark";
    }
}
