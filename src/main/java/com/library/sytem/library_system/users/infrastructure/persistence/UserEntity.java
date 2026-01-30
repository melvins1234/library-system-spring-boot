package com.library.sytem.library_system.users.infrastructure.persistence;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String schoolId;

    @NotNull
    @Column(nullable = false)
    private String firstName;

    @NotNull
    @Column(nullable = false)
    private String lastName;

    @Nullable
    private String middleName;
    @Nullable
    private String suffix;

    @NotNull
    @Column(nullable = false)
    private LocalDate birthDate;

    @Nullable
    private LocalDate hiredDate;

    @NotNull
    @Column(nullable = false)
    private String personalEmail;

    @Nullable
    private String phoneNumber;

    @Nullable
    private String telNumber;
}
