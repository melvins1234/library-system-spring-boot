package com.library.sytem.library_system.users.infrastructure.persistence;

import com.library.sytem.library_system.users.domain.model.User;
import com.library.sytem.library_system.users.domain.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.awt.print.Pageable;

@Component
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    public UserRepositoryImpl(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @Override
    public void save(User user) {
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userJpaRepository.findAll();
    }

}
