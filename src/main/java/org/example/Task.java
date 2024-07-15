package org.example;

import java.util.ArrayList;

public class Task implements ProjectItem {
    private String name;
    private ArrayList projectItems = new ArrayList();
    private Contact owner;
    private double timeRequired;

    public Task() {}

    public Task(String name, Contact owner, double timeRequired) {
        this.name = name;
        this.owner = owner;
        this.timeRequired = timeRequired;
    }

    public String getName() {
        return name;
    }

    public ArrayList getProjectItems() {
        return projectItems;
    }

    public Contact getOwner() {
        return owner;
    }

    @Override
    public double getTimeRequired() {
        double totalTime = timeRequired;
        for(Object projectItem : projectItems) {
            totalTime += ((ProjectItem) projectItem).getTimeRequired();
        }
        return totalTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Contact owner) {
        this.owner = owner;
    }

    public void setTimeRequired(double timeRequired) {
        this.timeRequired = timeRequired;
    }

    public void addProjectItem(ProjectItem item) {
        if(!projectItems.contains(item)) {
            projectItems.add(item);
        }
    }

    public void removeProjectItem(ProjectItem item) {
        projectItems.remove(item);
    }

    public String toString() {
        return "Task: " + name;
    }
}
