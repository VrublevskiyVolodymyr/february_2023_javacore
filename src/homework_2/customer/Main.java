package homework_2.customer;

//Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       Customer customer = new Customer(1,"vasya","pupkin","asd@asd.com",31,Gender.MALE, new ArrayList<Skill>(),"toyota", 2021,250);

        ArrayList <Skill> skills=customer.getSkills();
        skills.add(new Skill("java",10));
        skills.add(new Skill("js",10));
        skills.add(new Skill("c++",10));

        System.out.println(customer);
    }
}
