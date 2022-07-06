package network;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize
public enum ResponseStatus implements Serializable {
    SUCCESS, ERROR
}
