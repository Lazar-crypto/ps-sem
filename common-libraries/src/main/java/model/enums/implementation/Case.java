package model.enums.implementation;

import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Entity;
import model.enums.CaseType;

@Data @NoArgsConstructor
public class Case implements Entity{
    
    private static final String INSERT_ATTRIBUTES = "name,problem,recordDate,user_id,client_id,case_type_id";
    private static final String TABLE_NAME = "case";
    
    private long id;
    private String name;
    private String problem;
    private LocalDate recordDate;
    private User user;
    private Client client;
    private CaseType caseType;
    
}
