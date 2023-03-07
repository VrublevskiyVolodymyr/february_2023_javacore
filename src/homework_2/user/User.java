package homework_2.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
   private int id;
    private String name;
   private String username;
   private String mail;
   private Address address;
    private String phone;
    private String website;
    private Company company;


    public User(int id, String name, String username, String mail,String street, String suite, String city, String zipcode, String lat, String lng, String phone, String website,String nameCompany,String catchPhrase,String bs) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.mail = mail;
        this. address = new Address( street,  suite,  city, zipcode, lat,  lng);
        this.phone = phone;
        this.website = website;
        this.company = new Company(nameCompany,catchPhrase,bs);
    }
}
