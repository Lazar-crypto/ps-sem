package model.enums;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;

@JsonSerialize
public enum ClientProperty implements Serializable{
    DEFENDANT,
    PROSECUTOR
}
