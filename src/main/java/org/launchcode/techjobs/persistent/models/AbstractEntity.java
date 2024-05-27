package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity {
    
    @Id
    @GeneratedValue
    private int id;
    
    @Size(max = 255, message = "Name cannot be more than 255 characters")
    @NotBlank (message = "Name cannot be blank")
    private String name;

    public int getId() {
        return id;
    }
    
    public @Size(max = 255, message = "Name cannot be more than 255 characters") @NotBlank(message = "Name cannot be blank") String getName() {
        return name;
    }
    
    public void setName(@Size(max = 255, message = "Name cannot be more than 255 characters") @NotBlank(message = "Name cannot be blank") String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
