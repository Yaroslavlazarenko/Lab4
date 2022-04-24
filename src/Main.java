public class Main {

    public static void main(String[] args) {
        //task1();
        task2();
    }

    /**
     * Вывести данные о пластинках, тираж которых
     * превышает 10000 экземпляров.
     * <p>
     * Исполнитель
     * Жанр
     * Название альбома
     * Тираж
     */
    private static void task1() {
        final byte NumberPlate = 4;

        Plate plate1 = new Plate();
        Plate plate2 = new Plate();
        Plate plate3 = new Plate();
        Plate plate4 = new Plate();
        final Plates plates = new Plates(NumberPlate);

        plates.addPlate(plate1);
        plates.addPlate(plate2);
        plates.addPlate(plate3);
        plates.addPlate(plate4);

        for (byte i = 0; i < NumberPlate; i++)
            fillPlateData(plates.givePlate(i));

        for (byte i = 0; i < NumberPlate; i++)
            plates.givePlate(i).moreCopies();
    }

    /**
     * Вывести сведения о работниках, срок действия контракта
     * которых истекает в течении 5-ти дней.
     * <p>
     * Фамилия работника
     * Должность
     * Дата подписания контракта
     * Срок действия контракта
     * Оклад
     */

    private static void task2() {
        final byte NumberEmployees = 4;

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        final Employees employees = new Employees(NumberEmployees);

        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(employee3);
        employees.addEmployee(employee4);

        for (byte i = 0; i < NumberEmployees; i++)
            fillEmployers(employees.giveEmployee(i));

        for (byte i = 0; i < NumberEmployees; i++)
            employees.giveEmployee(i).soonEndContract();
    }

    private static void fillPlateData(Plate plate) {
        plate.setPerformer();
        plate.setGenre();
        plate.setAlbum();
        plate.setAmount();
    }

    private static void fillEmployers(Employee employee) {
        employee.setSurname();
        employee.setPosition();
        employee.setSigningContract();
        employee.setTermContract();
        employee.setSalary();
    }
}
