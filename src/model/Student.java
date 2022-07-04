package model;

import type.People;

public class Student extends People {


    public Student(String name, String surname, int age, Address address) {
        super(name, surname, age, address);

    }
    @Override
    public String toString () {
        return getName()+" "+getSurname();
    }

    public void studentInfo () {
        System.out.println ("��� ��������: "+getName());
        System.out.println ("������� ��������: "+getSurname());
        System.out.println ("������� ��������: "+getAge());
        System.out.println ("������ ��������: "+getAddress());

    }

}
