package com.generics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

// Class Resume
public class Resume<T extends JobRole> {
    private List<T> resumes;

    // Constructor
    public Resume() {
        resumes = new ArrayList<>();
    }

    // Add Resume method
    public void addResume(T resume) {
        resumes.add(resume);
    }

    // To return resumes detail
    public List<? extends JobRole> getAllResumes() {
        return resumes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (JobRole resume : resumes) {
            sb.append(resume.toString()).append("\n");
        }
        return sb.toString();
    }
}
