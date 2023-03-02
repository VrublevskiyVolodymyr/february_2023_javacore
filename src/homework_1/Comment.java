package homework_1;

//створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/comments/1

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
