public class TesterClass {
    public static void main(String[] args) {

        //DECLARATION OF STUDENTS
        Student student1,student2;

        //INSTANCES OF STUDENTS
        student1=new Student("Giacomo");
        student2=new Student("Francesco");

        //DECLARATION OF TEACHER
        Teacher teacher1;

        //INSTANCES OF TEACHER
        teacher1=new Teacher();
        teacher1.teacherName="Giuseppa";

        //ASSIGN GRADE METHOD
        teacher1.assignGrade(student1,10);
        teacher1.assignGrade(student2,8);

        //PRINT DETAILS METHOD
        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
