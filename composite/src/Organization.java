import java.util.ArrayList;
import java.util.List;

class Organization {

    private List<Employee> employees = new ArrayList<>();


    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public double getNetSalaries() {
        double netSalary = 0;
        for (Employee employee : employees) {
            netSalary += employee.getSalary();
        }
        return netSalary;
    }
}
