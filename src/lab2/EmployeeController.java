package lab2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public void setHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }

    public void updateView() {
        view.printEmployeeDetails(model);
    }
}

