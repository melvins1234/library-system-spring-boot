package com.library.sytem.library_system.users.infrastructure.persistence;

import com.library.sytem.library_system.users.domain.model.User;
import com.library.sytem.library_system.users.domain.vo.SchoolId;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setSchoolId(user.getSchoolId().getValue()); // Assuming SchoolId has getValue()
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
        entity.setMiddleName(user.getMiddleName());
        entity.setSuffix(user.getSuffix());
        entity.setBirthDate(user.getBirthDate());
        entity.setHiredDate(user.getHiredDate());
        entity.setPersonalEmail(user.getPersonalEmail());
        entity.setPhoneNumber(user.getPhoneNumber());
        entity.setTelNumber(user.getTelNumber());
        return entity;
    }
    public User toDomain(UserEntity userEntity) {
        // Mapping logic from UserEntity to User domain model
        User user = User.create(
                new SchoolId(userEntity.getSchoolId()),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getMiddleName(),
                userEntity.getSuffix(),
                userEntity.getBirthDate(),
                userEntity.getHiredDate(),
                userEntity.getPersonalEmail(),
                userEntity.getPhoneNumber(),
                userEntity.getTelNumber()
        );
        return user;
    }
}
