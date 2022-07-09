package model.enums.implementation;

import lombok.Data;
import lombok.NoArgsConstructor;
import model.Entity;

@Data @NoArgsConstructor
public class CaseItem implements Entity{
    
    private static final String INSERT_ATTRIBUTES = "internal_number,official_number,case_id";
    private static final String TABLE_NAME = "case_item";
    
    long id;
    int internalNumber;
    int officialNumber;
    Case case1;
}
