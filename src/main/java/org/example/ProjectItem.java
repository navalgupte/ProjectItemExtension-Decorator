package org.example;

import java.io.Serializable;

public interface ProjectItem extends Serializable {
    public static final String EOL_STRING = System.lineSeparator();
    public double getTimeRequired();
}
