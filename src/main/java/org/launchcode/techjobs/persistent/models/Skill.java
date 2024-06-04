package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    
    @NotBlank (message = "Description cannot be blank")
    @Size(max = 255, message = "Description cannot be more than 255 characters")
    private String description;
    
    @ManyToMany (mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();
    
    public Skill() {
    }
    
    public Skill(String description) {
        this.description = description;
    }
    
    public @NotBlank(message = "Description cannot be blank") @Size(max = 255, message = "Description cannot be more than 255 characters") String getDescription() {
        return description;
    }
    
    public void setDescription(@NotBlank(message = "Description cannot be blank") @Size(max = 255, message = "Description cannot be more than 255 characters") String description) {
        this.description = description;
    }
}
