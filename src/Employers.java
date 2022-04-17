import java.time.LocalDate;
import java.util.*;

public class Employers {
    private Surnames surname;
    private Positions position;
    private LocalDate signingContract;
    private int termContract;
    private int salary;

    public void setSurname() {
        this.surname = Surnames.surnames[(int) (Math.random() * Surnames.surnames.length)];
    }

    public void setPosition() {
        this.position = Positions.positions[(int) (Math.random() * Positions.positions.length)];
    }

    public void setSigningContract() {
        this.signingContract = LocalDate.now().minusDays((int) (Math.random() * 5 + 30));
    }

    public void setTermContract() {
        this.termContract = (int) (Math.random() * 20 + 31);
    }

    public void setSalary() {
        this.salary = (int) (Math.random() * 5000 + 10000);
    }

    public void soonEndContract() {
        if (signingContract.plusDays(termContract).toEpochDay() - LocalDate.now().toEpochDay() < 6) {
            System.out.println("Фамилия: " + surname);
            System.out.println("Профессия: " + position);
            System.out.println("Дата подписания контракта: " + signingContract);
            System.out.println("Длительность контракта: " + termContract);
            System.out.println("Оклад: " + salary + "\n");
        }
    }
}
