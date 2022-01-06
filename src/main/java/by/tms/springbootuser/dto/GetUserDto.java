package by.tms.springbootuser.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;


@Component
@NoArgsConstructor
@AllArgsConstructor
public class GetUserDto {
    @NotBlank(message = " Field Username is empty")
    private String username;
    @NotBlank(message = "Field password is empty")
    private String password;
}
