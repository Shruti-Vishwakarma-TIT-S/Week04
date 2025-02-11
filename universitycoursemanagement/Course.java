package com.generics.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

// Generic class of type T extends CourseType
public class Course <T extends CourseType>{
    private List<T> courses;

    // Constructor
    public Course(){
        courses = new ArrayList<>();
    }

    // Method to add
    public void addCourse(T course){
        courses.add(course);
    }

    // method to return courses
    public List<? extends CourseType> getAllCourses(){
        return courses;
    }

    // Overridden method toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (CourseType course : courses){
            sb.append(course.toString()).append("\n");
        }
        return sb.toString();
    }
}
