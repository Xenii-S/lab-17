package lab2;

public class Demo {
    public static void main(String[] args) {

        Employee employee = new Employee("Annya", 610.25, 90);

        EmployeeView employeeView = new EmployeeView();

        EmployeeController employeeController = new EmployeeController(employee, employeeView);

        employeeController.updateView();

        employeeController.setHourlyRate(460.0);
        employeeController.setHoursWorked(176);

        employeeController.updateView();
    }
}
