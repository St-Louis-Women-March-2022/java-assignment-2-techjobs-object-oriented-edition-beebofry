package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

@Test
    public void testSettingJobId(){
    Job job1 = new Job();
    Job job2 = new Job();
    assertNotEquals(job1.getId(), job2.getId());
}

@Test
    public void testJobConstructorSetsAllFields(){
    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(testJob instanceof Job);
    assertEquals(testJob.getName(), "Product tester");
    assertTrue(testJob.getEmployer() instanceof Employer);
    assertEquals(testJob.getEmployer().getValue(), "ACME");
    assertTrue(testJob.getLocation() instanceof Location);
    assertEquals(testJob.getLocation().getValue(), "Desert");
    assertTrue(testJob.getPositionType() instanceof PositionType);
    assertEquals(testJob.getPositionType().getValue(), "Quality control");
    assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    assertEquals(testJob.getCoreCompetency().getValue(),"Persistence");
}

@Test
    public void testJobsForEquality(){
    Job job1 = new Job("Barista", new Employer("The Abbey"), new Location("Belleville"), new PositionType("Coffee maker"), new CoreCompetency("Loves coffee"));
    Job job2 = new Job("Barista", new Employer("The Abbey"), new Location("Belleville"), new PositionType("Coffee maker"), new CoreCompetency("Loves coffee"));
    assertFalse(job1 == job2);
}

@Test
    public void testToStringStartsAndEndsWithNewLine() {
    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String testToString = testJob.toString();
    assertEquals(testToString.charAt(0), '\n');
    assertEquals(testToString.charAt(testToString.length() - 1), '\n');
}

@Test
    public void testToStringContainsCorrectLabelsAndData() {
    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    String testToString = testJob.toString();
    int id = testJob.getId();
    assertEquals(testToString, "\nID: "+ id +
            "\nName: Product tester" +
            "\nEmployer: ACME" +
            "\nLocation: Desert" +
            "\nPosition Type: Quality control" +
            "\nCore Competency: Persistence\n");
}

@Test
    public void testToStringHandlesEmptyField(){
    Job testJobEmpty = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    String testToString = testJobEmpty.toString();
    int id = testJobEmpty.getId();
    assertEquals(testToString, "\nID: "+ id +
            "\nName: Data not available" +
            "\nEmployer: Data not available" +
            "\nLocation: Data not available" +
            "\nPosition Type: Data not available" +
            "\nCore Competency: Data not available\n");
    }
}
