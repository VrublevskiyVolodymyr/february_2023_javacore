package Homework_1;

public class Main {
    public static void main(String[] args) {

        Post post1 = new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", " quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        Comment comment1 = new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");

        String[] authors = {"John Doe"};
        Book book1 = new Book("The Golden Books", 150, authors, "Anthology");

        Car car1 = new Car("BMV", 750, 2.0, true);
        car1.setModel("KIA");
        String model = car1.getModel();

        Dog dog1 = new Dog("Bars", 2, "mutt");

        String[] order = new String[3];
        order[0] = "Laptop";
        order[1] = "Tea";
        order[2] = "Apple";
        Customer customer1 = new Customer(1, "Petya", "Petrov", "067-45-25-652", "jgk@mg", order);

        String[] array1 = {"qwe", "rty", "uio", "asd", "fgh", "jkl", "zxc", "vbn", "mlp", "jhg"};

        for (String s : array1) {
            System.out.println(s);
        }
            System.out.println("************************************************");

        int[] array2 = {1,2,3,4,5,6,7,8,9,10};

        for (int i1 : array2) {
            System.out.println(i1);
        }
            System.out.println("************************************************");

        double[] weight = {12.2,20.1,3.2,45.2,11.3,55.6,78.5,66.2,99.2,11.2};

        for (double v : weight) {
            System.out.println(v);
        }
            System.out.println("************************************************");

        boolean[] status = {true,false,false,true,true,false,false,true,true,false};

        for (boolean b : status) {
            System.out.println(b);
        }
            System.out.println("************************************************");

        System.out.println(post1);
        System.out.println(comment1);
        System.out.println(book1);
        System.out.println(car1);
        System.out.println(dog1);
        System.out.println(car1.getModel());
        System.out.println(model);
        System.out.println(customer1);

    }
}
