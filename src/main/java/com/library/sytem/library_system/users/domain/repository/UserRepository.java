package com.library.sytem.library_system.users.domain.repository;

import com.library.sytem.library_system.users.domain.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UserRepository {
    void save(User user);
    Page<User> findAll(Pageable pageable);
}
