package model.implementation;

import model.Entity;


public class CaseItem implements Entity{
    
    private static final String INSERT_ATTRIBUTES = "name,problem,recordDate,user_id,client_id,case_type_id";
    private static final String TABLE_NAME = "case";
    
    long id;
    int internalNumber;
    int officialNumber;
    Case case1;
}
