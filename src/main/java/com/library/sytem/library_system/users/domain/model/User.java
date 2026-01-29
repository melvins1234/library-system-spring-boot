package com.library.sytem.library_system.users.domain.model;

import com.library.sytem.library_system.users.domain.vo.SchoolId;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class User {
    private String id;
    private SchoolId schooolId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;
    private LocalDate birthDate;
    private LocalDate hiredDate;
    private String personalEmail;
    private String phoneNumber;
    private String telNumber;

    private User() {

    }

    public static User create(
        SchoolId schoolId,
        String firstName,
        String lastName,
        String middleName,
        String suffix,
        LocalDate birthDate,
        LocalDate hiredDate,
        String personalEmail,
        String phoneNumber,
        String telNumber
    ) {

        if (birthDate != null && birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Birth date cannot be future");
        }
        if (hiredDate != null && hiredDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Hire date cannot be future");
        }

        User user = new User();
        user.schooolId = schoolId;
        user.firstName = firstName;
        user.lastName = lastName;
        user.middleName = middleName;
        user.suffix = suffix;
        user.birthDate = birthDate;
        user.hiredDate = hiredDate;
        user.personalEmail = personalEmail;
        user.phoneNumber = phoneNumber;
        user.telNumber = telNumber;

        return user;
    }

    public void changePersonalEmail(String newEmail) {
        this.personalEmail = Objects.requireNonNull(newEmail);
    }

    public int calculateAge() {
        if (birthDate == null) return 0;
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
