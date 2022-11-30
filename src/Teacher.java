public class Teacher {
    //INSTANCE VARIABLES
    public String teacherName;


    //CONSTRUCTOR METHOD
    public Teacher(){
        System.out.println("A new teacher was created");
    }
    public void assignGrade(Student student,int finalGrade){
        student.grade=finalGrade;
    }
}
