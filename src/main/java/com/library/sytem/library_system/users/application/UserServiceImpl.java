package com.library.sytem.library_system.users.application;

import com.library.sytem.library_system.common.model.PagedResult;
import com.library.sytem.library_system.users.UserService;
import com.library.sytem.library_system.users.domain.model.User;
import com.library.sytem.library_system.users.domain.repository.UserRepository;
import com.library.sytem.library_system.users.infrastructure.web.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
        Sort sort = Sort.by("lastName").ascending();
        int page = pageNo <= 1 ? 0 : pageNo - 1;
        Pageable pageable = PageRequest.of(page, 10, sort);
        Page<User> users = userRepository.findAll(pageable);

        // Map to DTOs using Page.map()
        Page<UserDTO> userDTOPage = users.map(this::toDTO);

        return new PagedResult<>(userDTOPage);
    }

    private UserDTO toDTO(User user) {
        return new UserDTO(
                user.getSchoolId().getValue(),
                user.getFirstName(),
                user.getLastName(),
                user.getMiddleName(),
                user.getSuffix(),
                user.getBirthDate(),
                user.getHiredDate(),
                1,
                user.getPhoneNumber(),
                user.getTelNumber()
        );
    }
}
