package homework_3.entity.printable;

import lombok.*;

import java.util.ArrayList;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Book implements Printable{
    private String title;
    private int year;
    private String size;
    private ArrayList<String> authors = new ArrayList<>();
    private String publisher;
    private int pages;

    @Override
    public void print() {
        System.out.println("Book: " + title + " by " + authors);
    }
}
