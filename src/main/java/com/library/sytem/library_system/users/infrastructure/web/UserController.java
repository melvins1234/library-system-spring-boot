package com.library.sytem.library_system.users.infrastructure.web;

import com.library.sytem.library_system.common.model.PagedResult;
import com.library.sytem.library_system.users.UserService;
import com.library.sytem.library_system.users.infrastructure.web.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping
    PagedResult<UserDTO> getAllUsers(@RequestParam(name = "page", defaultValue = "1") int page) {
        log.info("Fetching users for page: {}", page);
        return userService.getAllUsers(page);
    }

}
