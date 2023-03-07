package homework_2.additional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Comment {
  private int postId;
  private int id;
  private String name;
  private String email;
  private String body;

}
