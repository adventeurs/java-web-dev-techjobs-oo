package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job firstJob;
    Job secondJob;

    @Before
    public void createJobObjects(){
        firstJob = new Job();
        secondJob = new Job();
    }

    @Test
    public void testSettingJobId(){
        assertFalse(firstJob.equals(secondJob));
    }

    @Test
    public void testJobConstructor(){
        firstJob = new Job("Product Test", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(firstJob.getEmployer() instanceof  Employer);
        assertTrue(firstJob.getLocation() instanceof  Location);
        assertTrue(firstJob.getPositionType() instanceof  PositionType);
        assertTrue(firstJob.getCoreCompetency() instanceof  CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        firstJob = new Job("Product Test", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        secondJob = new Job("Product Test", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse((firstJob.equals(secondJob)));
    }

    @Test
    public void toStringTest(){
        String[] test = firstJob.toString().split("\\r?\\n");

        assertEquals("", test[0]);

        assertEquals(7, test.length);

        assertTrue(test[2].contains("Data not available"));
        assertTrue(test[3].contains("Data not available"));
        assertTrue(test[4].contains("Data not available"));
        assertTrue(test[5].contains("Data not available"));
        assertTrue(test[6].contains("Data not available"));
    }
}
