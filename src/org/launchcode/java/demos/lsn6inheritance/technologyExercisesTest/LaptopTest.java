package org.launchcode.java.demos.lsn6inheritance.technologyExercisesTest;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.java.demos.lsn6inheritance.technologyExercises.Laptop;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    private Laptop test_laptop;

    @Before
    public void createLaptopObject(){
        test_laptop = new Laptop("personal laptop", true, 6000, "silver");
    }

    @Test
    public void testLaptopFieldsSetCorrectly(){
        assertEquals("personal laptop", test_laptop.getName());
        assertEquals(true, test_laptop.isAppleProduct());
        assertEquals(6000, test_laptop.getMemoryInGB(), .001);
        assertEquals("silver", test_laptop.getColor());
    }

    @Test
    public void testPrintColorAccuracy(){
        assertEquals("The laptop color is silver.", test_laptop.printColor("silver"));
    }

}
