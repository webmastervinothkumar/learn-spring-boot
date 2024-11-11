package com.webmaster.learnwebappjsp.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    @Size(min = 10, message = "Enter at least 10 characters")
    private String description;
    private boolean done;
    private LocalDate targetDate;
    private String username;

    public Todo( long id, String name, String description, boolean done, LocalDate targetDate, String username) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.done = done;
        this.targetDate = targetDate;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", done=" + done
                + ", targetDate=" + targetDate + " username=" + username + "]";
    }
}
