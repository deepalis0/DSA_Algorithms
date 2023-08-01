package Constructors;

public class Student {

    String name;
    int rollID;

    Student()
    {

    }
    //Parameterized constructor
    Student(String name,int rollID)
    {
        this.name = name;
        this.rollID = rollID;
    }

    Student(String name)
    {
        this.name = name;
    }


}
