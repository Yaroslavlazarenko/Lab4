public class Plate {
    private Performers performer;
    private Genres genre;
    private Albums album;
    private int amount;

    public void setPerformer() {
        this.performer = Performers.performers[(int) (Math.random() * Performers.performers.length)];
    }

    public Performers getPerformer(){
        return this.performer;
    }

    public void setGenre() {
        this.genre = Genres.genres[(int) (Math.random() * Genres.genres.length)];
    }

    public Genres getGenre(){
        return this.genre;
    }

    public void setAlbum() {
        this.album = Albums.albums[(int) (Math.random() * Albums.albums.length)];
    }

    public Albums getAlbum(){
        return this.album;
    }

    public void setAmount() {
        this.amount = (int) (Math.random() * 16000);
    }

    public int getAmount(){
        return this.amount;
    }

    public void fillPlateData(){
        this.setPerformer();
        this.setGenre();
        this.setAlbum();
        this.setAmount();
    }

    @Override
    public String toString() {
        return "Исполнитель: " + this.performer.toString().substring(0,1).toUpperCase() +
                this.performer.toString().substring(1).toLowerCase() +

                "\nЖанр: " + this.genre.toString().substring(0,1).toUpperCase() +
                this.genre.toString().substring(1).toLowerCase() +

                "\nАльбом: " + this.album.toString().substring(0,1).toUpperCase() +
                this.album.toString().substring(1).toLowerCase() +

                "\nТираж: " + this.amount + "\n";
    }
}
