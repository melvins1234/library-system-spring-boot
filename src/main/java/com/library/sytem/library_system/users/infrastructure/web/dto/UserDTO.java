package com.library.sytem.library_system.users.infrastructure.web.dto;

import java.util.Date;

public record UserDTO (
    String schoold_id,
    String first_name,
    String last_name,
    String middle_name,
    String suffix,
    Date birth_date,
    Date hired_date,
    int status,
    String phone_number,
    String tel_number
) { }
