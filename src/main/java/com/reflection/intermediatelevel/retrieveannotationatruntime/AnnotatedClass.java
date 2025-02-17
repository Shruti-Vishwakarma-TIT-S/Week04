package com.reflection.intermediatelevel.retrieveannotationatruntime;

@Author(name = "Shruti Vishwakarma")
public class AnnotatedClass {
    private String authorName;

    public AnnotatedClass(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void displayAuthorName() {
        System.out.println("Author: " + authorName);
    }
}
