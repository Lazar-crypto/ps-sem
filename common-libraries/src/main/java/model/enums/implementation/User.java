package model.enums.implementation;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.Entity;

@Data @NoArgsConstructor
public class User implements Entity{
    
    private static final String INSERT_ATTRIBUTES = "attorney_identification_number, name, surname, email, password";
    private static final String TABLE_NAME = "user";
    
    private long id;
    private long attorneyIdentificationNumber;
    private String name;
    private String surname;
    private String email;
    private String password;

}
