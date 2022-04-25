import java.time.LocalDate;

public class Employee {
    private Surnames surname;
    private Positions position;
    private LocalDate signingContract;
    private int termContract;
    private int salary;

    public Surnames getSurname() {
        return this.surname;
    }

    public void setSurname(Surnames surname) {
        this.surname = surname;
    }

    public Positions getPosition() {
        return this.position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    public LocalDate getSigningContract() {
        return this.signingContract;
    }

    public void setRandomSigningContract(LocalDate signingContract) {
        this.signingContract = signingContract;
    }

    public int getTermContract() {
        return this.termContract;
    }

    public void setRandomTermContract(int termContract) {
        this.termContract = termContract;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setRandomSurname() {
        this.surname = Surnames.surnames[(int) (Math.random() * Surnames.surnames.length)];
    }

    public void setRandomPosition() {
        this.position = Positions.positions[(int) (Math.random() * Positions.positions.length)];
    }

    public void setRandomSigningContract() {
        this.signingContract = LocalDate.now().minusDays((int) (Math.random() * 5 + 30));
    }

    public void setRandomTermContract() {
        this.termContract = (int) (Math.random() * 20 + 31);
    }

    public void setRandomSalary() {
        this.salary = (int) (Math.random() * 5000 + 10000);
    }



    public void fillEmployeeData() {
        this.setRandomSurname();
        this.setRandomPosition();
        this.setRandomSigningContract();
        this.setRandomTermContract();
        this.setRandomSalary();
    }

    @Override
    public String toString() {
        return "\nsurname = " + this.surname.toString().substring(0,1).toUpperCase() +
                this.surname.toString().substring(1).toLowerCase()+
                "\nposition = " + this.position.toString().substring(0,1).toUpperCase() +
                this.position.toString().substring(1).toLowerCase() +
                "\nsigningContract = " + this.signingContract +
                "\ntermContract = " + this.termContract +
                "\nsalary = " + this.salary+"\n";
    }
}
