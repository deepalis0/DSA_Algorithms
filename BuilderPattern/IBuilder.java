package BuilderPattern;

public interface IBuilder {

    IBuilder setName(String name);
    IBuilder setAddress(String address);
    IBuilder setAge(int age);
    IBuilder setDesignation(String designation);
    IBuilder setUniqueID(int uniqueID);

    IBuilder build();

    IBuilder reset();
}
