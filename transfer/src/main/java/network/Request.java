package network;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonSerialize
@Data @AllArgsConstructor @NoArgsConstructor
public class Request implements Serializable {
   
    private  Object data;
    private  RequestType requestType;

}