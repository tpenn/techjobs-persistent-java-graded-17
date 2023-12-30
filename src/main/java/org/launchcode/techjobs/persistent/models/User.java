package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
public class User extends AbstractEntity {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @NotNull
    private String username;

    @NotNull
    private String passcodeHash;

    public User() {
    }

    public User(String username, String passcodeHash) {
        this.username = username;
        this.passcodeHash = encoder.encode(passcodeHash);
    }

    public String getUsername() {
        return username;
    }

    public boolean isMatchingPasscode(String passcode) {
        return encoder.matches(passcode, passcodeHash);
    }
}
