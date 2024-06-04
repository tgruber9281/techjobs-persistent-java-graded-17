package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    
    @NotBlank (message = "Location cannot be blank")
    @Size(max = 100, message = "Location cannot be more than 100 characters")
    private String location;
    
    @OneToMany
    @JoinColumn (name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();
    
    public Employer() {
    }
    
    public Employer(String location) {
        this.location = location;
    }
    
    public void addJob(Job job) {
        jobs.add(job);
    }
    
    public List<Job> getJobs() {
        return jobs;
    }
    
    public @NotBlank(message = "Location cannot be blank") @Size(max = 100, message = "Location cannot be more than 100 characters") String getLocation() {
        return location;
    }
    
    public void setLocation(@NotBlank(message = "Location cannot be blank") @Size(max = 100, message = "Location cannot be more than 100 characters") String location) {
        this.location = location;
    }
}
