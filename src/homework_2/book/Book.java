package homework_2.book;

public class Book extends Papyrus{
    private String publisher;
    private int pages;

    public Book() {
    }

    public Book(String[] authors, String title, int year, String size, String publisher, int pages) {
        super(authors, title, year, size);
        this.publisher = publisher;
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publisher='" + publisher + '\'' +
                ", pages=" + pages +
                "} " + super.toString();
    }
}
