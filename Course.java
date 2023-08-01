public class Course {

    String courseName;
    int marks;
    int courseID;

    void teaches()
    {
        System.out.println("TeacherBuilder is teaching the course " + courseName);
    }

    void setCourseName(String courseName)  //setters
    {
        this.courseName = courseName;
    }

    public static void main(String[] args)
    {
        Course dsa = new Course();
        Course frontEnd = new Course();
        Course backend = new Course();

       // dsa.courseName = "Data Structures and Algorithms";

       // frontEnd.courseName ="ReactJS";


        backend.setCourseName("Backend");
        dsa.setCourseName("DSA");
        frontEnd.setCourseName("React");

        dsa.teaches();
        frontEnd.teaches();
        backend.teaches();


        Course[] courseObject = new Course[3];
        for(int i=0;i<3;i++)
        {
            courseObject[i] =  new Course();
        }
        System.out.println(courseObject[0].courseID);





       // System.out.println("The courseName is :" + frontEnd.courseName + " "+ frontEnd.courseID );

    }

}
