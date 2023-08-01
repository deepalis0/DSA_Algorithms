public class Student {

    //data members -> properties
    private static int numberOfStudents;
    private String name;

    public final String collegeName;

    int a;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     static int getTotalStudents() {

        return numberOfStudents;
    }

    public void study()
    {
        System.out.println("Studying!!");
    }


    public static boolean validateName(String name) {
        // Name should not be null or empty
        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        // Name should contain only letters, spaces, or hyphens
        if (!name.matches("[a-zA-Z\\s\\-]+")) {
            return false;
        }

        // Name should not be too short or too long
        if (name.length() < 2 || name.length() > 50) {
            return false;
        }

        // All checks passed - name is valid
        return true;
    }


    Student(String collegeName) {
        this.collegeName = collegeName;
        numberOfStudents++;
    }

    Student()
    {
        this.collegeName = "collegeName";
    }

}

class Demo{
    public static void main(String[] args)
    {

        Student s1 = new Student("XYZ");
        Student s2 = new Student("ABC");
        Student s3 = new Student("PQR");


        if(Student.validateName("Sonali"))
        {
            s1.setName("Sonali");
        }
        if(Student.validateName("Deepali"))
        {
            s2.setName("Deepali");
        }
        if(Student.validateName("Kedar"))
        {
            s3.setName("Kedar");
        }
        System.out.println(s3.collegeName);
        System.out.println(s2.collegeName);
        System.out.println(s1.collegeName);


       System.out.println("The number of students: "+ Student.getTotalStudents());

    }



}
