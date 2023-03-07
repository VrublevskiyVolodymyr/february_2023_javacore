package homework_2.book;

public class Magazine extends Book{
    private String category;

    public Magazine() {
    }

    public Magazine(String[] authors, String title, int year, String size, String publisher, int pages, String category) {
        super(authors, title, year, size, publisher, pages);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "category='" + category + '\'' +
                "} " + super.toString();
    }
}
