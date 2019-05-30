import java.util.List;

interface Employee {
    String getName();

    void setName(String name);

    double getSalary();

    void setSalary(double salary);

    List<String> getRoles();

    void setRoles(List<String> roles);
}
