package ru.gb.study_group;

import ru.gb.study_group.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service =  new Service();

        service.addStudent("Паша", 18);
        service.addStudent("Даша", 18);
        service.addStudent("Саша", 19);
        service.addStudent("Маша", 17);

        System.out.println(service.getStudentsListInfo());
        service.sortByName();
        System.out.println(service.getStudentsListInfo());
        service.sortByAge();
        System.out.println(service.getStudentsListInfo());
    }
}
