package model.implementation;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.Entity;

@Data @NoArgsConstructor
public class User implements Entity{
    
    private static final String INSERT_ATTRIBUTES = "attorney_identification_number, name, surname, email, password";
    private static final String TABLE_NAME = "user";
    
    long id;
    long attorneyIdentificationNumber;
    String name;
    String surname;
    String email;
    String password;

}
