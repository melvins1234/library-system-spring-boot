package com.library.sytem.library_system.users.infrastructure.persistence;

import com.library.sytem.library_system.users.domain.model.User;
import com.library.sytem.library_system.users.domain.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;


@Component
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    public UserRepositoryImpl(UserJpaRepository userJpaRepository, UserMapper userMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userMapper = userMapper;
    }

    @Override
    public void save(User user) {
        UserEntity entity = userMapper.toEntity(user);
        userJpaRepository.save(entity);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        Page<UserEntity> entityPage = userJpaRepository.findAll(pageable);
        return entityPage.map(userMapper::toDomain);
    }

}
