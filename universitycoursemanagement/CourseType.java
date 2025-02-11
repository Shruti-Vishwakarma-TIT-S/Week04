package com.generics.universitycoursemanagement;

public abstract class CourseType {
    private String courseName;

    // Constructor
    public CourseType(String courseName){
        this.courseName = courseName;
    }

    // To get courseName
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString(){
        return "CourseName: " + getCourseName();
    }
}
