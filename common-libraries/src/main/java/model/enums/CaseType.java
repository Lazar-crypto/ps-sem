package model.enums;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;

@JsonSerialize
public enum CaseType implements Serializable{
   
    FIRST("Parnicni"),
    SECOND("Vanparnicni"),
    THIRD("Izvrsni"),
    FOURTH("Prekrsajni"),
    FIFFTH("Krivicni"),
    ;
    private final String value;
    
    CaseType(String value){
        this.value = value; 
    }

    @Override
    public String toString() {
        return value;
    }

}
