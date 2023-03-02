package homework_2.book;

//Cтворити клас ланцюг наслідування:
//        Папірус-Кинга-Журнал
//        Папірус-Книга-Комікс
//        Кількість полів довільна.

public class Main {
    public static void main(String[] args) {

        Papyrus papyrus = new Papyrus(new String[]{"Platon"},"Sisyphus",-340,"340*400");

        Book book = new Book(new String[]{"Paulo Coelho"},"The alchemist",2003,"120*160","Sofia",204);

        Magazine magazine = new Magazine(new String[]{"Petrov","Shevchenco"},"Local history",2023,"210x270","Ukrainian Galician Assembly",20,"history");

        Comics comics = new Comics(new String[]{"Zeb Wells"}, "The Amazing Spider-Man",2023,"240*120","Marvel",30,"John Romita");

        System.out.println(papyrus);
        System.out.println(book);
        System.out.println(magazine);
        System.out.println(comics);
    }


}
