package lab;

public class StudentView {
    public void printStudentDetails(Student student) {
        System.out.println("Student: ");
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Name: " + student.getName());
    }
}
