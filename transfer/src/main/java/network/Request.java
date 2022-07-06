package network;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize
public class Request implements Serializable {
    private final Object data;
    private final RequestType requestType;

    public Request(Object data, RequestType requestType) {
        this.data = data;
        this.requestType = requestType;
    }

    public Object getData() {
        return data;
    }

    public RequestType getOperation() {
        return requestType;
    }
}
