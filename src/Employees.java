public class Employees {
    private final Employee[] employees;
    private int currentEmployerNumber;

    public Employees(final byte employersNumber) {
        this.employees = new Employee[employersNumber];
        currentEmployerNumber = -1;
    }

    public void addEmployee(final Employee employee) {
        if (++currentEmployerNumber < employees.length)
            employees[currentEmployerNumber] = employee;
    }

    public Employee giveEmployee(byte NumberEmployee){
        return employees[NumberEmployee];
    }

}
