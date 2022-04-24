public class Plate {
    private Performers performer;
    private Genres genre;
    private Albums album;
    private int amount;
    private boolean moreTenThousand;

    public void setPerformer() {
        this.performer = Performers.performers[(int) (Math.random() * Performers.performers.length)];
    }

    public void setGenre() {
        this.genre = Genres.genres[(int) (Math.random() * Genres.genres.length)];
    }

    public void setAlbum() {
        this.album = Albums.albums[(int) (Math.random() * Albums.albums.length)];
    }

    public void setAmount() {
        this.amount = (int) (Math.random() * 16000);
        if (this.amount > 10000)
            this.moreTenThousand = true;
    }

    public void moreCopies() {
        if (this.moreTenThousand)
            System.out.println("Исполнитель: " + this.performer.toString().substring(0,1).toUpperCase() +
                    this.performer.toString().substring(1).toLowerCase() +

                    "\nЖанр: " + this.genre.toString().substring(0,1).toUpperCase() +
                    this.genre.toString().substring(1).toLowerCase() +

                    "\nАльбом: " + this.album.toString().substring(0,1).toUpperCase() +
                    this.album.toString().substring(1).toLowerCase() +

                    "\nТираж: " + this.amount + "\n");
    }
}
