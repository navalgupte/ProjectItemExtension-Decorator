package org.example;

import java.io.File;
import java.util.ArrayList;

public class SupportedProjectItem extends ProjectDecorator {
    private ArrayList supportingDocuments = new ArrayList();

    public SupportedProjectItem() {}

    public SupportedProjectItem(File supportingDocument) {
        addSupportingDocument(supportingDocument);
    }

    public ArrayList getSupportingDocuments() {
        return supportingDocuments;
    }

    public void addSupportingDocument(File document) {
        if(!supportingDocuments.contains(document)) {
            supportingDocuments.add(document);
        }
    }

    public void removeSupportingDocument(File document) {
        supportingDocuments.remove(document);
    }

    public String toString() {
        return getProjectItem().toString() + EOL_STRING +
                "\tSupporting Documents: " + supportingDocuments;
    }
}
