
// 1. Create a Student class to simulate a student's profile. The class should have the following attributes: student ID, name, and GPA. 
// Include methods to updateGPA() and printProfile(). Implement functionality to create new student profiles, update GPAs, and print student profiles.
public class Task1 {
    public static void main(String[] args){
        Student s=new Student(1, "Nischay Maharjan", 3.6);
        s.updateGPA(4.0);
        System.out.println(s.printStudentProfiles());
    }


}

class Student{
    int student_id;
    String name;
    double gpa;

    public Student(int student_id, String name, double gpa){
        this.student_id=student_id;
        this.name=name;
        this.gpa=gpa;
    }
    public void updateGPA(double gpa){
        this.gpa=gpa;
    }

    public String printStudentProfiles(){
        return("Student_id: "+this.student_id+"\nName: "+this.name+"\nGpa: "+this.gpa);

    }
}