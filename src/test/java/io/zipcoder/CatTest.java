package io.zipcoder;

import junit.framework.TestCase;

public class CatTest extends TestCase {

    public void testSpeak() {
        //given
        Cat cat = new Cat("Kitty");

        //when
        String actual = cat.speak();
        String expected = "Meow";

        assertEquals(expected, actual);
    }
}