package homework_2.book;

public class Comics extends Book{
    private String artist;

    public Comics() {
    }

    public Comics(String[] authors, String title, int year, String size, String publisher, int pages, String artist) {
        super(authors, title, year, size, publisher, pages);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    @Override
    public String toString() {
        return "Comics{" +
                "artist='" + artist + '\'' +
                "} " + super.toString();
    }
}
