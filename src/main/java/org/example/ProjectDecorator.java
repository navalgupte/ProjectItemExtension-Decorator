package org.example;

/*
    ProjectDecorator Class - Provides central ability to augment Task and Deliverable objects.
 */
public abstract class ProjectDecorator implements ProjectItem {
    private ProjectItem projectItem;    // Represents the "decorated" element

    protected ProjectItem getProjectItem() {
        return projectItem;
    }

    public void setProjectItem(ProjectItem projectItem) {
        this.projectItem = projectItem;
    }

    public double getTimeRequired() {
        return projectItem.getTimeRequired();
    }
}
