package homework_2.user;

//створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
//        https://jsonplaceholder.typicode.com/users/1

public class Main {
    public static void main(String[] args) {

        Address address = new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", "-37.3159", "81.1496");
        Company company = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");

        User user1 = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", address, "1-770-736-8031 x56442", "hildegard.org", company);

        User user2 = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz","Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", "-37.3159", "81.1496", "1-770-736-8031 x56442", "hildegard.org","Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");

        System.out.println(user1);
        System.out.println(user2);

    }
}
