package homework_4.models.zooclub;

import java.util.*;

public class ZooClub {
    private final Map<Person, List<Pet>> club;

    public ZooClub() {
        club = new TreeMap<>();
    }

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    public void addPet(Person person, Pet pet) {
        club.computeIfPresent(person, (key, pets) -> {
            pets.add(pet);
            return pets;
        });
    }

    public void removePet(Person person, Pet pet) {
        club.computeIfPresent(person, (key, pets) -> {
            pets.remove(pet);
            return pets;
        });
    }

    public void removeMember(Person person) {
        club.remove(person);
    }

    public void removePetFromAll(Pet pet) {
        club.values().forEach(pets -> pets.remove(pet));
    }

    public void displayClub() {
        club.forEach((person, pets) -> {
            System.out.println(person.getName() + ":");
            pets.forEach(System.out::println);
            System.out.println();
        });
    }
}
