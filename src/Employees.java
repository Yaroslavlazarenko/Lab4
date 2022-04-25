import java.time.LocalDate;
import java.util.Arrays;

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

    public final Employees soonEndContract(Employees employees) {
        byte NumberEmployees=0;
        for (byte i = 0; i < this.employees.length; i++) {
            if (employees.giveEmployee(i).getSigningContract().plusDays(employees.giveEmployee(i).getTermContract()).toEpochDay() - LocalDate.now().toEpochDay() < 6)
                NumberEmployees++;
        }

        final Employees temp = new Employees(NumberEmployees);
        for (byte i = 0; i < this.employees.length; i++) {
            if (employees.giveEmployee(i).getSigningContract().plusDays(employees.giveEmployee(i).getTermContract()).toEpochDay() - LocalDate.now().toEpochDay() < 6)
                temp.addEmployee(employees.giveEmployee(i));
        }
        return temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(employees);
    }
}
