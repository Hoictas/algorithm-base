package cn.tiakon.java.code.bean;

public class Person {
    private String lastName;
    private String firstName;
    private int age;


    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print("Last Name : " + lastName);
        System.out.print("\tFirst Name : " + firstName);
        System.out.println("\tAge : " + age);
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
