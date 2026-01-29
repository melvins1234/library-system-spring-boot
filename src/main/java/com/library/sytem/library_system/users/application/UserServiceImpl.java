package com.library.sytem.library_system.users.application;

import com.library.sytem.library_system.common.model.PagedResult;
import com.library.sytem.library_system.users.UserService;
import com.library.sytem.library_system.users.domain.repository.UserRepository;
import com.library.sytem.library_system.users.infrastructure.web.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public PagedResult<UserDTO> getAllUsers(int pageNo) {
        int page = pageNo <= 1 ? 0 : pageNo - 1;
        Pageable pageable = PageRequest.of(page, 10);
        Page<UserDTO> users = userRepository.findAll(pageable);
        userRepository
    }
}
