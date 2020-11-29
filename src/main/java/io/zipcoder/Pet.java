package io.zipcoder;

import java.util.*;

public abstract class Pet implements Comparable<Pet> {

    private String name;
    private String type;


    public Pet(String name) {
        this.name = name;
        this.type = "Ima boss";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String speak() {
        return "Feed me";
    }

    @Override
    public int compareTo(Pet o) {
        int pet = this.name.compareTo(o.getName());
        return pet == 0 ? this.type.compareTo(o.getType()) : pet;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(type, pet.type) &&
                Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}


