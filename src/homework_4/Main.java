package homework_4;

import homework_4.models.Client;
import homework_4.models.Gender;
import homework_4.models.Skills;
import homework_4.models.User;
import homework_4.models.zooclub.Person;
import homework_4.models.zooclub.Pet;
import homework_4.models.zooclub.ZooClub;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        створити ArrayList зі словами на 15-20 елементів.
//                - відсортувати його за алфавітом .
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("banana");
        wordList.add("apple");
        wordList.add("orange");
        wordList.add("pear");
        wordList.add("grape");
        wordList.add("watermelon");
        wordList.add("kiwi");
        wordList.add("pineapple");
        wordList.add("mango");
        wordList.add("strawberry");
        wordList.add("blueberry");
        wordList.add("peach");
        wordList.add("apricot");
        wordList.add("cherry");
        wordList.add("plum");

        wordList.sort(String::compareTo);
        System.out.println(wordList);
        System.out.println("-----------------------------------------------------------------------------------");

//        Створити List Юзерів
//                - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
        List<User> users1 = new ArrayList<>();
        users1.add(new User("anna", 35));
        users1.add(new User("petya", 38));
        users1.add(new User("kolya", 25));
        users1.add(new User("myroslawa", 46));
        users1.add(new User("mykola", 16));
        users1.add(new User("sergiy", 26));
        users1.add(new User("francheska", 45));

        users1.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users1);

        users1.sort((o1, o2) -> o2.getAge()-o1.getAge());
        System.out.println(users1);

        users1.sort(Comparator.comparingInt(o -> o.getName().length()));
        System.out.println(users1);

        users1.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println(users1);
        System.out.println("-----------------------------------------------------------------------------------");

//        Створити клас котрий відповідає наступній моделі
//        {
//            id: 1,
//                    name: 'vasya',
//                surname: 'pupkin',
//                email: 'asd@asd.com',
//                age: 31,
//                gender: 'MALE',
//                skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//            car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
        Client client1 = new Client(1, "Max", "Popov", "popov@gmail.com", 18, Gender.MALE, new ArrayList<>(), "Kia", 2008, 600);
        ArrayList<Skills> skills1 = client1 .getSkills();
        skills1.add(new Skills("java", 10));
        skills1.add(new Skills("js", 5));
        skills1.add(new Skills("c++", 5));

        Client client2 = new Client(2, "Vasya", "Vasylov", "vasyav@gmail.com", 20, Gender.MALE, new ArrayList<>(), "Kia", 2009, 800);
        ArrayList<Skills> skills2 = client2.getSkills();
        skills2.add(new Skills("python", 10));
        skills2.add(new Skills("js", 5));

        Client client3 = new Client(3, "Nadya", "Nadova", "nadya@gmail.com", 22, Gender.FEMALE, new ArrayList<>(), "BMW", 2010, 600);
        ArrayList<Skills> skills3 = client3.getSkills();
        skills3.add(new Skills("java", 10));
        skills3.add(new Skills("js", 5));
        skills3.add(new Skills("python", 10));

        Client client4 = new Client(4, "Anna", "Annova", "anna@gmail.com", 18, Gender.FEMALE, new ArrayList<>(), "Ford", 2008, 600);
        ArrayList<Skills> skills4 = client4.getSkills();
        skills4.add(new Skills("java", 10));
        skills4.add(new Skills("js", 5));
        skills4.add(new Skills("nodejs", 5));

        Client client5 = new Client(5, "Inna", "Innova", "inna@gmail.com", 28, Gender.FEMALE, new ArrayList<>(), "Toyota", 2020, 600);
        ArrayList<Skills> skills5 = client5.getSkills();
        skills5.add(new Skills("js", 5));

        Client client6 = new Client(6, "Ivan", "Ivanov", "ivan@gmail.com", 43, Gender.MALE, new ArrayList<>(), "Subaru", 2016, 900);
        ArrayList<Skills> skills6 = client6.getSkills();
        skills6.add(new Skills("java", 10));
        skills6.add(new Skills("js", 5));
        skills6.add(new Skills("nodejs", 5));

        Client client7 = new Client(7, "Sasha", "Sashov", "sasha@gmail.com", 36, Gender.MALE, new ArrayList<>(), "Audi", 2007, 600);
        ArrayList<Skills> skills7 = client7.getSkills();
        skills7.add(new Skills("js", 5));
        skills7.add(new Skills("nodejs", 5));
        skills7.add(new Skills("python", 10));
        skills7.add(new Skills("java", 10));

        Client client8 = new Client(8, "Olya", "Olegivna", "olya@gmail.com", 25, Gender.FEMALE, new ArrayList<>(), "Mersedes", 2010, 700);
        ArrayList<Skills> skills8 = client8.getSkills();
        skills8.add(new Skills("java", 10));
        skills8.add(new Skills("js", 5));

        Client client9 = new Client(9, "Kolya", "Koval", "kolya@gmail.com", 33, Gender.MALE, new ArrayList<>(), "Kia", 2008, 600);
        ArrayList<Skills> skills9 = client9.getSkills();
        skills9.add(new Skills("java", 10));
        skills9.add(new Skills("c++", 5));

        Client client10 = new Client(10, "Lida", "Popova", "lida@gmail.com", 36, Gender.FEMALE, new ArrayList<>(), "Volvo", 2020, 1200);
        ArrayList<Skills> skills10 = client10.getSkills();
        skills10.add(new Skills("java", 10));
        skills10.add(new Skills("js", 5));
        skills10.add(new Skills("nodejs", 5));
        skills10.add(new Skills("c++", 10));
        skills10.add(new Skills("python", 10));

        HashSet<Client> clientHashSet = new HashSet<>();
        clientHashSet.add(client1);
        clientHashSet.add(client2);
        clientHashSet.add(client3);
        clientHashSet.add(client4);
        clientHashSet.add(client5);
        clientHashSet.add(client6);
        clientHashSet.add(client7);
        clientHashSet.add(client8);
        clientHashSet.add(client9);
        clientHashSet.add(client10);

        clientHashSet.removeIf(client -> client.getGender() == Gender.MALE);

        clientHashSet.forEach(System.out::println);
        System.out.println();

        TreeSet<Client> clientTreeSet = new TreeSet<>();
        clientTreeSet.add(client1);
        clientTreeSet.add(client2);
        clientTreeSet.add(client3);
        clientTreeSet.add(client4);
        clientTreeSet.add(client5);
        clientTreeSet.add(client6);
        clientTreeSet.add(client7);
        clientTreeSet.add(client8);
        clientTreeSet.add(client9);
        clientTreeSet.add(client10);

        Set<Client> clientTreeSet2 = clientTreeSet.stream()
                .sorted((o1, o2) -> o1.getSkills().size()-o2.getSkills().size())
                .collect(Collectors.toCollection(LinkedHashSet::new));

        clientTreeSet2.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------------");

//        Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В зооклубі створити методи, та застосувати їх
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.
//        Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//                Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку
        ZooClub zooClub = new ZooClub();

        Pet pet1 = new Pet("Cat", "Whiskers");
        Pet pet2 = new Pet("Dog", "Fido");
        Pet pet3 = new Pet("Fish", "Goldie");
        Pet pet4 = new Pet("Bird", "Polly");
        Pet pet5 = new Pet("Rabbit", "Thumper");
        Pet pet6 = new Pet("Hamster", "Nibbles");
        Pet pet7 = new Pet("Snake", "Monty");
        Pet pet8 = new Pet("Turtle", "Speedy");
        Pet pet9 = new Pet("Guinea Pig", "Puddles");
        Pet pet10 = new Pet("Lizard", "Spike");

        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 32);
        Person person3 = new Person("Charlie", 19);
        Person person4 = new Person("David", 27);
        Person person5 = new Person("Eve", 21);
        Person person6 = new Person("Frank", 38);
        Person person7 = new Person("Grace", 29);
        Person person8 = new Person("Hank", 41);
        Person person9 = new Person("Irene", 23);
        Person person10 = new Person("Julia", 36);

        zooClub.addMember(person1);
        zooClub.addMember(person2);
        zooClub.addMember(person3);
        zooClub.addMember(person4);
        zooClub.addMember(person5);
        zooClub.addMember(person6);
        zooClub.addMember(person7);
        zooClub.addMember(person8);
        zooClub.addMember(person9);
        zooClub.addMember(person10);

        zooClub.addPet(person1, pet1);
        zooClub.addPet(person1, pet2);
        zooClub.addPet(person1, pet3);
        zooClub.addPet(person2, pet2);
        zooClub.addPet(person2, pet4);
        zooClub.addPet(person3, pet1);
        zooClub.addPet(person3, pet5);
        zooClub.addPet(person3, pet6);
        zooClub.addPet(person4, pet7);
        zooClub.addPet(person6, pet8);
        zooClub.addPet(person6, pet10);
        zooClub.addPet(person7, pet9);
        zooClub.addPet(person8, pet6);
        zooClub.addPet(person8, pet10);
        zooClub.addPet(person9, pet3);
        zooClub.addPet(person9, pet7);
        zooClub.addPet(person10, pet5);
        zooClub.addPet(person10, pet9);

        System.out.println("Initial state of the zoo club:");
        System.out.println("------------------------------");
        zooClub.displayClub();


        System.out.println("Removing a pet from a member:");
        System.out.println("-----------------------------");
        zooClub.removePet(person1, pet1);
        zooClub.displayClub();


        System.out.println("Removing a member:");
        System.out.println("------------------");
        zooClub.removeMember(person5);
        zooClub.displayClub();

        System.out.println("Removing a pet from all members:");
        System.out.println("--------------------------------");
        zooClub.removePetFromAll(pet10);
        zooClub.displayClub();
    }

}
