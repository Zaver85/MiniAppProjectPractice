package ru.gb.study_group.service;

import ru.gb.study_group.student.Student;
import ru.gb.study_group.builder.StudentBuilder;
import ru.gb.study_group.study_group.StudyGroup;

public class Service {
    private StudentBuilder studentBuilder;
    private StudyGroup studyGroup;

    public Service() {
        studyGroup = new StudyGroup();
        studentBuilder = new StudentBuilder();
    }

    public void addStudent(String name, int age) {
        Student student = studentBuilder.build(name, age);
        studyGroup.addStudent(student);
    }

    public void sortByName() {
        studyGroup.sortByName();
    }

    public void sortByAge() {
        studyGroup.sortByAge();
    }

    public String getStudentsListInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов:\n");

//        Iterator<Student> iterator = studyGroup.iterator();
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            stringBuilder.append(student);
//            stringBuilder.append("\n");
//        }

        for (Student student : studyGroup) {
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return  stringBuilder.toString();

    }
}
