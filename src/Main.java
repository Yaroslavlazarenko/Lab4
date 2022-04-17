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
        Plates plate1 = new Plates();
        Plates plate2 = new Plates();
        Plates plate3 = new Plates();
        Plates plate4 = new Plates();
        Plates[] plates = new Plates[]{plate1, plate2, plate3, plate4};

        fillPlateData(plates);
        moreCopies(plates);
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
        Employers employer1 = new Employers();
        Employers employer2 = new Employers();
        Employers employer3 = new Employers();
        Employers employer4 = new Employers();
        Employers[] employers = new Employers[]{employer1,employer2,employer3,employer4};

        fillEmployers(employers);
        soonEndContract(employers);
    }

    private static void fillPlateData(Plates plates[]) {
        for (Plates plate : plates) {
            plate.setPerformer();
            plate.setGenre();
            plate.setAlbum();
            plate.setAmount();
        }
    }

    private static void moreCopies(Plates plates[]) {
        for (Plates plate : plates)
            plate.moreCopies();
    }

    private static void fillEmployers(Employers employers[]){
        for(Employers employer:employers){
            employer.setSurname();
            employer.setPosition();
            employer.setSigningContract();
            employer.setTermContract();
            employer.setSalary();
        }
    }

    private static void soonEndContract(Employers employers[]){
        for(Employers employer:employers){
            employer.soonEndContract();
        }
    }
}
