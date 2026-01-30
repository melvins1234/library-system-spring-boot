package com.library.sytem.library_system.users.infrastructure.web.dto;

import java.time.LocalDate;

public record UserDTO (
    String schoold_id,
    String first_name,
    String last_name,
    String middle_name,
    String suffix,
    LocalDate birth_date,
    LocalDate hired_date,
    int status,
    String phone_number,
    String tel_number
) { }
