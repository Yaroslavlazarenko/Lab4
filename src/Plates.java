public class Plates {
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
        if (moreTenThousand) {
            System.out.println("Исполнитель: " + performer);
            System.out.println("Жанр: " + genre);
            System.out.println("Альбом: " + album);
            System.out.println("Тираж: " + amount + "\n");
        }
    }

}
