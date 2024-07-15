package org.example;

import java.io.File;

public class RunPattern {
    public static void main(String[] args) {
        System.out.println("Example showing use of Decorator Pattern");
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Creating ProjectItems");
        Contact contact1 = new ContactImpl("Simone", "Roberts", "Chief Researcher and Archivist", "Institute of Advanced Studies");
        Task task1 = new Task("Research on Design Pattern Development", contact1, 20.0);
        Task task2 = new Task("Obtain research grant", contact1, 40.0);
        Deliverable deliverable1 = new Deliverable("Design Patterns Artifact", "Comprehensive documentation on commonly used design patterns in Java", contact1);
        System.out.println("ProjectItem objects created..");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(deliverable1);
        System.out.println();
        System.out.println("Creating decorators..");
        ProjectDecorator decorator1 = new SupportedProjectItem(new File("CompleteDesignPatterns.txt"));
        ProjectDecorator decorator2 = new DependentProjectItem(task2);
        System.out.println();
        System.out.println("Decorators created. Adding decorators to first task..");
        decorator1.setProjectItem(task1);
        decorator2.setProjectItem(decorator1);
        System.out.println();
        System.out.println("Decorators added. Result..");
        System.out.println(decorator2);
        System.out.println("---- ---- ---- ---- ----");
    }
}