package network;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize
public class Response implements Serializable {
    private final Object data;
    private final ResponseStatus status;
//    private String errorMessage;
    private Exception error;
    public Response(Object data, ResponseStatus status, Exception error) {
        this.data = data;
        this.status = status;
        this.error = error;
    }

    public Response(Object data, ResponseStatus status) {
        this.data = data;
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public Exception getError() {
        return error;
    }

    @Override
    public String toString() {
        return "Response{" +
                "data=" + data +
                ", status=" + status +
                ", error=" + error +
                '}';
    }
}
