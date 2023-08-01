package BuilderPattern;

public class StudentBuilder  implements IBuilder{
    private Student student;

    public StudentBuilder reset()
    {
        this.student = new Student();
        return this;
    }

    public StudentBuilder setName(String name)
    {
        student.name = name;
        return this;
    }


    public StudentBuilder setAddress(String address) {
        student.address = address;
        return this;
    }


    public StudentBuilder setAge(int age) {

        student.age = age;
        return this;
    }


    public StudentBuilder setDesignation(String designation) {
        return this;
    }


    public StudentBuilder setUniqueID(int uniqueID) {
       student.rollID = uniqueID;
       return this;
    }


    public StudentBuilder build()
    {
     return this;
    }

    public Student getStudent()
    {
        Student student1 = this.student;
        reset();
        return student1;
    }

}
