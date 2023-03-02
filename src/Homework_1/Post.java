//створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/posts/1

package Homework_1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

}
