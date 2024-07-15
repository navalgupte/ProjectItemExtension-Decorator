package org.example;

public class DependentProjectItem extends ProjectDecorator {
    private ProjectItem dependentItem;

    public DependentProjectItem() {}
    public DependentProjectItem(ProjectItem dependentItem) {
        this.dependentItem = dependentItem;
    }

    public ProjectItem getDependentItem() {
        return dependentItem;
    }

    public void setDependentItem(ProjectItem dependentItem) {
        this.dependentItem = dependentItem;
    }

    public String toString() {
        return getProjectItem().toString() + EOL_STRING +
                "\tProjectItem dependent on: " + dependentItem;
    }
}
