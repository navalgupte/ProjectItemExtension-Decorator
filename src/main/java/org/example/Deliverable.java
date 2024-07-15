package org.example;

public class Deliverable implements ProjectItem {
    private String name;
    private String description;
    private Contact owner;

    public Deliverable() {}

    public Deliverable(String name, String description, Contact owner) {
        this.name = name;
        this.description = description;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Contact getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOwner(Contact owner) {
        this.owner = owner;
    }

    public double getTimeRequired() {
        return 0;
    }

    public String toString() {
        return "Deliverable: " + name;
    }
}
