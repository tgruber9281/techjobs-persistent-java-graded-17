package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    
    @NotBlank (message = "Location cannot be blank")
    @Size(max = 100, message = "Location cannot be more than 100 characters")
    private String location;
    
    public Employer() {
    }
    
    public Employer(String location) {
        this.location = location;
    }
    
    public @NotBlank(message = "Location cannot be blank") @Size(max = 100, message = "Location cannot be more than 100 characters") String getLocation() {
        return location;
    }
    
    public void setLocation(@NotBlank(message = "Location cannot be blank") @Size(max = 100, message = "Location cannot be more than 100 characters") String location) {
        this.location = location;
    }
}
