package homework_3;

import homework_3.entity.instrument.Drum;
import homework_3.entity.instrument.Guitar;
import homework_3.entity.instrument.Instrument;
import homework_3.entity.instrument.Trumpet;
import homework_3.entity.printable.Book;
import homework_3.entity.printable.Magazine;
import homework_3.entity.printable.Printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar(7);
        Drum drum = new Drum("large");
        Trumpet trumpet = new Trumpet("brass");

        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(trumpet);

        for (Instrument instrument : instruments) {
            instrument.play();
        }

        System.out.println("---------------------------------------------------------------------------------------");

        Book book = new Book("The alchemist", 2003, "120*160", new ArrayList<>(), "Sofia", 204);
        book.getAuthors().add("Paulo Coelho");


        Magazine magazine = new Magazine("Local history", 2023, "210x270", new ArrayList<>(), "Ukrainian Galician Assembly", 20, "history", 25);
        magazine.getAuthors().add(0, "Shevchenco");
        magazine.getAuthors().add(1, "Petrov");

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(book);
        printables.add(magazine);

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
