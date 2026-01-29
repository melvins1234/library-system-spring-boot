package com.library.sytem.library_system.users;

import com.library.sytem.library_system.common.model.PagedResult;
import com.library.sytem.library_system.users.infrastructure.web.dto.UserDTO;

public interface UserService {
    PagedResult<UserDTO> getAllUsers(int pageNo);
}
