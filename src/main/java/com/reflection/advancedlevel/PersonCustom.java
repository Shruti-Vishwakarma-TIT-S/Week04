package com.reflection.advancedlevel;

// A sample class to be used in the test
class PersonCustom {
    private String name;
    private int age;

    public PersonCustom(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}