package com.generics.resumescreeningsystem;

import java.util.List;

//ResumeScreening class
public class ResumeScreening {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("Processing resume for: " + resume.getName());
        }
    }
}
