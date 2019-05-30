class Test {
    public static void main(String[] args) {
        Employee john = new Designer("John", 1200);
        Employee jane = new Developer("Jane", 3000);

        Organization organization = new Organization();
        organization.addEmployee(john);
        organization.addEmployee(jane);

        System.out.println("Net Salaries = " + organization.getNetSalaries());
    }
}
