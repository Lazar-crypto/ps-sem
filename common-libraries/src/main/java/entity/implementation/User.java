package entity.implementation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import entity.Entity;

@Data @NoArgsConstructor @AllArgsConstructor
public class User implements Entity{
    
    private int id;
    private int attorneyIdentificationNumber;
    private String name;
    private String surname;
    private String email;
    private String password;

}
