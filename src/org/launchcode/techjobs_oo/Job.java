package org.launchcode.techjobs_oo;

import java.util.Objects;


public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
        public Job(){
            id = nextId;
            nextId++;
        }

        public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
            this();
            this.name = name;
            this.employer = employer;
            this.location = location;
            this.positionType = positionType;
            this.coreCompetency = coreCompetency;
        }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

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

    public int getId() {
        return id;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String noData = "Data not available";
        String ifName = name != null ? name : noData;
        Object ifEmployer = !employer.getValue().equals("") ? employer : noData;
        Object ifLocation = !location.getValue().equals("") ? location : noData;
        Object ifPositionType = !positionType.getValue().equals("") ? positionType : noData;
        Object ifCoreCompetency = !coreCompetency.getValue().equals("") ? coreCompetency : noData;

        return "\n" +
                "ID: " + id  + "\n" +
                "Name: " + ifName + "\n" +
                "Employer: " + ifEmployer  + "\n" +
                "Location: " + ifLocation + "\n" +
                "Position Type: " + ifPositionType + "\n" +
                "Core Competency: " + ifCoreCompetency + "\n";
    }
}
