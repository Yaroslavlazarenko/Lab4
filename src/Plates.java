public class Plates {
    private final Plate[] plates;
    private int currentUserNumber;

    public Plates(final byte usersNumber) {
        this.plates = new Plate[usersNumber];
        currentUserNumber = -1;
    }

    public void addPlate(final Plate plate) {
        if (++currentUserNumber < plates.length)
            plates[currentUserNumber] = plate;
    }

    public Plate givePlate(byte NumberPlate){
        return plates[NumberPlate];
    }
}
