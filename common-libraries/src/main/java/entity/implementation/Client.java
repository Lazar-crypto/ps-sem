package entity.implementation;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import entity.Entity;
import entity.implementation.enums.ClientProperty;

@Data @NoArgsConstructor @AllArgsConstructor
public class Client implements Entity{
    
    private static final String INSERT_ATTRIBUTES = "name,surname,dateOfBirth,uniqueCitizenIdentityNumber,contactNumber,clientPropertyId ";
    private static final String TABLE_NAME = "client";

    private int id ;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String uniqueCitizensIdentityNumber;
    private String contactNumber;
    private ClientProperty clientProperty;
}
