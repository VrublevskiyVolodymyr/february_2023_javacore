package homework_2.book;

import java.util.Arrays;

public class Papyrus {
    private String[] authors;
    private String title;
    private int year;
    private String size;

    public Papyrus() {
    }

    public Papyrus(String[] authors, String title, int year, String size) {
        this.authors = authors;
        this.title = title;
        this.year = year;
        this.size = size;
    }
    public String[] getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getSize() {
        return size;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "authors=" + Arrays.toString(authors) +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", size='" + size + '\'' +
                '}';
    }
}
