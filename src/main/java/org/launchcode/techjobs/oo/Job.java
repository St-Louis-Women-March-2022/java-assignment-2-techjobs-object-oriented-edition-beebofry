package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString(){
        String jobInfoReport = "\n" +
                "ID: " + this.id + "\n" +
                "Name: ";
        if (name == "") {
            jobInfoReport += "Data not available\n";
        } else {
            jobInfoReport += this.name + "\n";
        }

        if (employer.getValue() == ""){
            jobInfoReport += "Employer: Data not available\n";
        } else {
            jobInfoReport += "Employer: " + this.employer + "\n";
        }
//
        if (location.getValue() == ""){
            jobInfoReport += "Location: Data not available\n";
        } else {
            jobInfoReport += "Location: " + this.location + "\n";
        }

        if (positionType.getValue() == ""){
            jobInfoReport += "Position Type: Data not available\n";
        } else {
            jobInfoReport += "Position Type: " + this.positionType + "\n";
        }

        if (coreCompetency.getValue() == "") {
            jobInfoReport += "Core Competency: Data not available\n";
        } else {
            jobInfoReport += "Core Competency: " + this.coreCompetency + "\n";
        }

        return jobInfoReport;
    }
}
