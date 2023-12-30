package org.launchcode.techjobs.persistent.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginFormDTO {
    @NotNull
    @NotBlank
    @Size(min = 3, max = 20, message = "Invalid username.  Usernames must be between 3 and 20 characters.")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 64, message = "Invalid password.  Passwords must be between 5 and 64 characters.")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
