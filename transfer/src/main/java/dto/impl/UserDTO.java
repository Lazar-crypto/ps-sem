package dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;

@Data @AllArgsConstructor
public class UserDTO implements Serializable {

    private final long id;
    private final String name;
    private final String email;

}
