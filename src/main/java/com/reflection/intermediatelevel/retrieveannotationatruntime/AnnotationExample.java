package com.reflection.intermediatelevel.retrieveannotationatruntime;

import java.lang.annotation.Annotation;

public class AnnotationExample {
    public static void main(String[] args) {
        try {
            // Use the fully qualified name of the AnnotatedClass
            Class<?> annotatedClass = Class.forName("com.reflection.intermediatelevel.retrieveannotationatruntime.AnnotatedClass");
            Annotation annotation = annotatedClass.getAnnotation(Author.class);

            if (annotation instanceof Author) {
                Author author = (Author) annotation;
                System.out.println("Author: " + author.name());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
