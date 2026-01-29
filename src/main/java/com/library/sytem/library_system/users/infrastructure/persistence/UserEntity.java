package com.library.sytem.library_system.users.infrastructure.persistence;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String schoolId;
    private String firstName;
    private String lastName;

    @Nullable
    private String middleName;
    @Nullable
    private String suffix;

    private Date birthDate;
    @Nullable
    private Date hiredDate;
    private String personalEmail;
    @Nullable
    private String phoneNumber;
    @Nullable
    private String telNumber;
}
