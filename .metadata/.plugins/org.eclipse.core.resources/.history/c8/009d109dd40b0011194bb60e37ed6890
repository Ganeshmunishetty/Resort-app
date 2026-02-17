package com.example.auth.util;

import java.util.regex.Pattern;

public final class PasswordValidator {

    private PasswordValidator() {}

    // Min 8 chars, upper, lower, digit, special char
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$"
    );

    public static boolean isValid(String password) {
        return PASSWORD_PATTERN.matcher(password).matches();
    }
}
