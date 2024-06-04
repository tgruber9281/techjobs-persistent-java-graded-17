package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Job extends AbstractEntity{
    
    @ManyToOne
    private Employer employer;
    
    @ManyToMany
    private Skill skills;


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, Skill someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.
    
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Skill getSkills() {
        return skills;
    }

    public void setSkills(Skill skills) {
        this.skills = skills;
    }

}
