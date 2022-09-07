package org.launchcode.java.demos.lsn6inheritance.technologyExercisesTest;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.technologyExercises.SmartPhone;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    private SmartPhone test_smartphone;

    @Before
    public void createSmartPhoneObject() {
        test_smartphone = new SmartPhone("personal phone", true, 300, 2000);
    }

    @Test
    public void testSmartPhoneFieldsSetCorrectly() {
        assertEquals("personal phone", test_smartphone.getName());
        assertEquals(true, test_smartphone.isAppleProduct());
        assertEquals(300, test_smartphone.getMemoryInGB(), .001);
        assertEquals(2000, test_smartphone.getNumberOfPhotos(), .001);
    }

    @Test
    public void testPercentPhotosOfTotalStorageIsAccurate() {
        assertEquals(4.0, test_smartphone.findPercentPhotoStorage(300, 2000), .001);
    }
}