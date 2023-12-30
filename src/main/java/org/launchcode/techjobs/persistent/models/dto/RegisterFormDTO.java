package org.launchcode.techjobs.persistent.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RegisterFormDTO extends LoginFormDTO {
    @NotNull
    @NotBlank
    @Size(min = 3, max = 20, message = "Invalid name.  Names must be between 3 and 64 characters.")
    private String name;

    private String verifyPassword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
