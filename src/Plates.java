import java.util.Arrays;

public class Plates {
    private final Plate[] plates;
    private int currentUserNumber;



//    public Plates(Plate ... plates) {
//        this.plates = plates;
//    }

    public Plates(final byte usersNumber) {
        this.plates = new Plate[usersNumber];
        currentUserNumber = -1;
    }

    public void addPlate(final Plate plate) {
        if (++currentUserNumber < plates.length)
            plates[currentUserNumber] = plate;
    }

    public final Plate givePlate(byte NumberPlate){
        return plates[NumberPlate];
    }

    public Plates findMore10000Copies(Plates plates) {
        byte NumberPlate=0;
        for(byte i = 0; i < this.plates.length; i++)
            if(plates.givePlate(i).getAmount()>10000)
                NumberPlate++;

        final Plates temp = new Plates(NumberPlate);
        for (byte i = 0; i < this.plates.length; i++)
            if(plates.givePlate(i).getAmount()>10000)
                temp.addPlate(plates.givePlate(i));
        return temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(plates);
    }
}
