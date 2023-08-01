package BuilderPattern;

public class Demo {

    public static void main(String[] args)
    {
        IBuilder teacherBuilder = new TeacherBuilder();
        StudentBuilder studentBuilder = new StudentBuilder();

        TeacherBuilder teacher = (TeacherBuilder)teacherBuilder.reset()
                .setName("Deepali")
                .setUniqueID(122)
                .setDesignation("Prof")
                .build();
        StudentBuilder kedarBuilder = studentBuilder.reset()
                .setName("Kedar")
                .setUniqueID(2)
                .setAge(21)
                .build();
        Student kedar = kedarBuilder.getStudent();
        kedar.display();

        StudentBuilder deepaliBuilder = studentBuilder.setName("Deepali")
                .setUniqueID(3)
                .build();
        Student deepali = deepaliBuilder.getStudent();
        deepali.display();

    }

}
