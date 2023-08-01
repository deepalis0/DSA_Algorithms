package BuilderPattern;

public class TeacherBuilder implements  IBuilder{
    String name;
    int age;
    String address;
    int empID;

    String designation;
    @Override
    public IBuilder reset()
    {
       return new TeacherBuilder();
    }
    @Override
    public IBuilder setName(String name) {
       this.name = name;
       return this;
    }

    @Override
    public IBuilder setAddress(String address) {
       this.address = address;
       return this;
    }

    @Override
    public IBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public IBuilder setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    @Override
    public IBuilder setUniqueID(int uniqueID) {
        this.empID = uniqueID;
        return this;
    }

    @Override
    public IBuilder build()
    {
        return this;
    }


}
