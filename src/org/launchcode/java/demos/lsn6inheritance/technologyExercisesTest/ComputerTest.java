package org.launchcode.java.demos.lsn6inheritance.technologyExercisesTest;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.technologyExercises.Computer;


import static org.junit.Assert.assertEquals;

public class ComputerTest {
    private
    Computer test_computer;

    @Before
    public void createComputerObject(){
        test_computer = new Computer("personal computer", false, 6000);
    }

    @Test
    public void testComputerFieldsSetCorrectly(){
        assertEquals("personal computer", test_computer.getName());
        assertEquals(false, test_computer.isAppleProduct());
        assertEquals(6000, test_computer.getMemoryInGB(), .001);
    }

    @Test
    public void testIncreaseStorageSumIsAccurate(){
        assertEquals(6100, test_computer.increaseStorage(6000), .001);
    }

    @Test
    public void testFindRepairShopIsAccurate(){
        assertEquals("Take product to local BestBuy.", test_computer.findRepairShop(false));
    }
}
