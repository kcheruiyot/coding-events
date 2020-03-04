package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 * Created by kipngetich
 */
@Entity
public class EventCategory {
    @Id
    @GeneratedValue
    private int id;
    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    public EventCategory(String name) {
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public EventCategory() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
