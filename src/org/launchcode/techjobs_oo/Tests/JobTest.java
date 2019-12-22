package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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


}
