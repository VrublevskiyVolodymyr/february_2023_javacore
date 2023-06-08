package homework_3.entity.printable;

import lombok.*;

import java.util.ArrayList;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Magazine extends Book implements Printable{
    private String category;
    private int issueNumber;

    @Override
    public void print() {
        System.out.println("Magazine: " + getTitle() + " Issue #" + issueNumber);
    }

    public Magazine(String title, int year, String size, ArrayList<String> authors, String publisher, int pages, String category, int issueNumber) {
        super(title, year, size, authors, publisher, pages);
        this.category = category;
        this.issueNumber = issueNumber;
    }
}
