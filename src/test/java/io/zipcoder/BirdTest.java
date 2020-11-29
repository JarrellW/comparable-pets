package io.zipcoder;

import junit.framework.TestCase;

public class BirdTest extends TestCase {

    public void testSpeak() {
        //given
       Bird bird = new Bird("Birdie");

        //when
        String actual = bird.speak();
        String expected = "Chirp";

        assertEquals(expected, actual);
    }
}