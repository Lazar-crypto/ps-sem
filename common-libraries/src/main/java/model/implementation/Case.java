package model.implementation;

import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Entity;
import model.enums.CaseType;

@Data @NoArgsConstructor
public class Case implements Entity{
    
    private static final String INSERT_ATTRIBUTES = "name,problem,recordDate,user_id,client_id,case_type_id";
    private static final String TABLE_NAME = "case";
    
    long id;
    String name;
    String problem;
    LocalDate recordDate;
    User user;
    Client client;
    CaseType caseType;
    
}
