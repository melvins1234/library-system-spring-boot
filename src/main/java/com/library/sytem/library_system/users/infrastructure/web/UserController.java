package com.library.sytem.library_system.users.infrastructure.web;

import com.library.sytem.library_system.common.model.PagedResult;
import com.library.sytem.library_system.users.UserService;
import com.library.sytem.library_system.users.infrastructure.web.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    private UserService userService;

    @PostMapping()
    PagedResult<UserDTO> getAllUsers(@RequestParam(name = "page", defaultValue = "1") int page) {
        log.info("Fetching users for page: {}", page);
        return new PagedResult<UserDTO>();
    }
}
