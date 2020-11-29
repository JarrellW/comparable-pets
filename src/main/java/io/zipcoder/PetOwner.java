package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PetOwner {
    private String petName;
    private Integer numberOfPets;
    private String typeOfPet;
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Pet> petList;

    public PetOwner(){
        this.petList = new ArrayList<>();
    }

    public PetOwner(String petName, String typeOfPet, Integer numberOfPets) {
        this.petName = petName;
        this.typeOfPet = typeOfPet;
        this.numberOfPets = numberOfPets;
    }

    public void petInput(){

        System.out.println("How many pets do you have?");
        Integer numOfPets = scanner.nextInt();
        scanner.nextLine();
        petList = new ArrayList<Pet>();

        for (int i = 1; i <= numOfPets; i++) {
            System.out.println("What is the name of pet number " + i + "?");
            String petName = scanner.nextLine();
            System.out.println("What kind of pet is pet number " + i + "?");
            String petType = scanner.nextLine();
            if(petType.equalsIgnoreCase("Dog")) {
                Dog dog = new Dog(petName);
                petList.add(dog);
            }
            if(petType.equalsIgnoreCase("Cat")){
                Cat cat = new Cat(petName);
                petList.add(cat);
            }
            if(petType.equalsIgnoreCase("Bird")){
                Bird bird = new Bird(petName);
                petList.add(bird);
            }

        }
        for (int i = 0; i < petList.size(); i++) {
            System.out.println("Pet " + i+1 + " is a " + petList.get(i).getClass().getSimpleName() + " named " + petList.get(i).getName() + ". It says " + petList.get(i).speak());
        }

    }
    public ArrayList<Pet> getPetList() {
        return this.petList;
    }

    public void setPetList(ArrayList<Pet> petList) {
        this.petList = petList;
    }

    public void addPetToPetList(Pet pet) {
        petList.add(pet);
    }

    public void petsByType() {
        getPetList().sort((o1, o2) -> {
            int result = o2.getType().compareTo(o1.getType());
            if (result == 0) {
                result = o1.getName().compareTo(o2.getName());
            }
            return result;
        });
    }

    public String getTypeOfPet() {
        return typeOfPet;
    }
}
