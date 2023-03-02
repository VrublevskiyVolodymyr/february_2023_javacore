package Homework_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
   int id;
    String name;
    String surname;
    String phone;
    String mail;
    String [] order;
}
