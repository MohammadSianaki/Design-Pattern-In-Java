import java.util.List;

class Designer implements Employee {
    private String name;
    private double salary;
    private List<String> roles;

    public Designer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public List<String> getRoles() {
        return this.roles;
    }

    @Override
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
