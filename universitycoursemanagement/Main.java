package com.generics.universitycoursemanagement;

public class Main {
    public static void main(String[] args) {

        // Object created of Different classes
        Course<ExamCourse> exam = new Course<>();
        Course<AssignmentCourse> assignment = new Course<>();
        Course<ResearchCourse> research = new Course<>();

        // To add courses
        exam.addCourse(new ExamCourse("MATHEMATICS EXAM"));
        assignment.addCourse(new AssignmentCourse("BIOLOGY ASSIGNMENT"));
        research.addCourse(new ResearchCourse("PHYSICS RESEARCH"));

        // To print Exam Courses
        System.out.println("All ExamCourses");
        for (CourseType course : exam.getAllCourses()){
            System.out.println(course+"\n");
        }

        // To print Assignment Courses
        System.out.println("All assignment course");
        for (CourseType course : assignment.getAllCourses()){
            System.out.println(course+ "\n");
        }

        // To print Research Courses
        System.out.println("All Research course");
        for (CourseType course : research.getAllCourses()){
            System.out.println(course+"\n");
        }
    }
}
