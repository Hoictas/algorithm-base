package cn.tiakon.java.code.chapter02;

import cn.tiakon.java.code.bean.Person;

public class D04_ArrayInObject {

    private Person[] persons;
    private int nElent;

    public D04_ArrayInObject(int size) {
        persons = new Person[size];
        nElent = 0;
    }


    public void insert(String lastName, String firstName, int age) {
        Person person = new Person(lastName, firstName, age);
        persons[nElent] = person;
        nElent++;
    }


    public void displayAll() {
        for (int i = 0; i < nElent; i++) {
            persons[i].displayPerson();
        }
    }

    public void insertSortByLastName() {

        int out, in;
        Person tmp;

        for (out = 1; out < nElent; out++) {
            tmp = persons[out];
            in = out;
            while (in > 0 && persons[in - 1].getLastName().compareTo(tmp.getLastName()) >= 0) {
                persons[in] = persons[in - 1];
                in--;
            }
            persons[in] = tmp;
        }

    }

    public void insertSortByAge() {
        int out, in;
        Person tmp;

        for (out = 1; out < nElent; out++) {
            tmp = persons[out];
            in = out;
            while (in > 0 && persons[in - 1].getAge() > tmp.getAge()) {
                persons[in] = persons[in - 1];
                in--;
            }
            persons[in] = tmp;
        }
    }
}
