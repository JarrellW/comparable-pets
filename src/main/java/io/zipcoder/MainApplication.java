package io.zipcoder;

public class MainApplication {

    public static void main(String[] args){
        PetOwner petOwner = new PetOwner();
        petOwner.petInput();
        System.out.println(petOwner.getPetList().toString());
        petOwner.petsByType();
        System.out.println(petOwner.getPetList().toString());
    }


}
