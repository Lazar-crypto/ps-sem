package model.implementation;

import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Entity;
import model.enums.ClientProperty;

@Data @NoArgsConstructor
public class Client implements Entity{
    
    private static final String INSERT_ATTRIBUTES = "name,surname,date_of_birth,unique_citizen_identity_number,contact_number,client_property_id ";
    private static final String TABLE_NAME = "client";
    
    long id ;
    String name;
    String surname;
    LocalDate dateOfBirth;
    String uniqueCitizensIdentityNumber;
    String contactNumber;
    ClientProperty clientProperty;
}
