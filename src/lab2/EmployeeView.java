package lab2;

// Класс представления
public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee: " + employee.getName());
        System.out.println("Hourly Rate: " + employee.getHourlyRate()+" rub");
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Salary: " + employee.calculateSalary()+" rub");
    }
}
