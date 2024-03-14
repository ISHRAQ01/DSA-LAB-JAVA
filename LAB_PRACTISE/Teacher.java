package com.demo;

public class Teacher {
    private String name;

    public Teacher(String name){
        this.name = name;
    }

    public void assignMarks(Student std, int marks){
        std.setMarks(marks);
    }
}
