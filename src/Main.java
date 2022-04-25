public class Main {

    public static void main(String[] args) {
        //task1();
        task2();
    }

    /**
     * Вывести данные о пластинках, тираж которых
     * превышает 10000 экземпляров.
     *
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


        for (byte i = 0; i < NumberPlate; i++) {
            plates.givePlate(i).fillPlateData();
        }

        System.out.println(plates.findMore10000Copies(plates));

//      final Plates plates2 = new Plates(plate1, plate2, plate3, plate4, plate1, plate1, plate3);
//      System.out.println(plates2);
    }


    /**
     * Вывести сведения о работниках, срок действия контракта
     * которых истекает в течении 5-ти дней.
     *
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

        for (byte i = 0; i < NumberEmployees; i++) {
            employees.giveEmployee(i).fillEmployeeData();
        }

        System.out.println(employees.soonEndContract(employees));
    }
}
