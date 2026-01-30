package com.library.sytem.library_system.users.domain.vo;

import lombok.Getter;

@Getter
public class SchoolId {
    private final String value;

    public SchoolId(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("School ID cannot be null or empty");
        }
        this.value = value;
    }
}
