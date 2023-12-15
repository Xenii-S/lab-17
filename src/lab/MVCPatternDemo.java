package lab;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        System.out.println("After updating:");
        controller.setStudentName("Pasha Sasha");
        controller.setStudentRollNo("12345");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        return new Student("xxxxx", "Default Student");
    }
}
