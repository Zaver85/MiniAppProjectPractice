package ru.gb.study_group.student;

import ru.gb.study_group.study_group.ItemStudyGroup;

public class Student implements Comparable<Student>, ItemStudyGroup {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        return this.name.compareTo(anotherStudent.name);
    }
}
