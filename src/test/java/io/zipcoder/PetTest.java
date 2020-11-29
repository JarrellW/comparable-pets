package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PetTest {

    @Test
    public void compareToTest1(){
        Cat cat1 = new Cat("Rex");
        Cat cat2 = new Cat("Taby");
        int actual = cat1.compareTo(cat2);
        Assert.assertTrue( actual < 0);
    }

    @Test
    public void compareToTest2(){
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Rex");
        int actual = dog.compareTo(cat);
        Assert.assertFalse( actual > 0);
    }

    @Test
    public void petByTypeTest(){
        PetOwner petOwner = new PetOwner();
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Rex");
        petOwner.addPetToPetList(dog);
        petOwner.addPetToPetList(cat);
        String expectedOrder = String.valueOf(petOwner.getPetList());
        petOwner.petsByType();
        String actualOrder = String.valueOf(petOwner.getPetList());
        Assert.assertEquals( expectedOrder, actualOrder);
    }


    }
