package ru.gb.study_group.study_group;

import ru.gb.study_group.student.Student;
import ru.gb.study_group.student.comparators.StudentComparatorByAge;
import ru.gb.study_group.student.comparators.StudentComparatorByName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private List<Student> students;

    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public  void sortByName() {
        students.sort(new StudentComparatorByName());
    }

    public void sortByAge() {
        students.sort(new StudentComparatorByAge());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }

}
