package ru.gb.study_group.student.comparators;

import ru.gb.study_group.student.Student;
import ru.gb.study_group.study_group.ItemStudyGroup;

import java.util.Comparator;

public class StudentComparatorByAge<T extends ItemStudyGroup> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getAge() - o2.getAge();
    }
}
