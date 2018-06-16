package cn.tiakon.java.code.chapter01;

public class D05_ClassDataAraay {
    private D05_Person[] persons;
    private int nElems;

    public D05_ClassDataAraay(int size) {
        persons = new D05_Person[size];
        nElems = 0;
    }

    //按姓查找
    public D05_Person find(String searchName) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (persons[i].getLastName().equals(searchName)) break;
        }
        if (i == nElems) {
            return null;//没找到
        } else {
            return persons[i];//找到了
        }
    }

    public void insert(String lastName, String firstName, int age) {
        D05_Person person = new D05_Person(lastName, firstName, age);
        persons[nElems] = person;
        nElems++;
    }

    public boolean delete(String searchName) {
        int i;

        for (i = 0; i < nElems; i++) {
            if (persons[i].getLastName().equals(searchName)) break;
        }

        if (i == nElems) {
            return false;//没找到
        } else {
            System.out.println("delete success " + persons[i].getLastName());
            for (int j = i; j < nElems; j++) {
                persons[j] = persons[j + 1];
            }
            nElems--;
            return true;
        }
    }

    public void displayAll() {
        for (int i = 0; i < nElems; i++) {
            persons[i].displayPerson();
        }
    }

}
