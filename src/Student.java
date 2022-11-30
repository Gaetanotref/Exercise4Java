public class Student {
    //INSTANCE VARIABLES
    public String name;
    public int grade;
    //CONSTRUCTOR METHOD+ASSIGN NAME
    public Student(String name){
        System.out.println("Object created, the name of the student is "+name);
        this.name=name;
    }
    //PRINT DETAILS OF STUDENT
    public void getStudentDetails(){
        System.out.println("For "+name+" the final grade is "+grade);
    }
}
