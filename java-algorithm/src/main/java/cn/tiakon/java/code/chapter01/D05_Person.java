package cn.tiakon.java.code.chapter01;

public class D05_Person {
    private String lastName;
    private String firstName;
    private int age;


    public D05_Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print("Last Name : " + lastName);
        System.out.print(" ,First Name : " + firstName);
        System.out.println(" ,Age : " + age);
    }

    public String getLastName() {
        return lastName;
    }
}
