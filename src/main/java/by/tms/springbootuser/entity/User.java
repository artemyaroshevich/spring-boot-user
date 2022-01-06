package by.tms.springbootuser.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {

    String name;
    String username;
    String password;
}
