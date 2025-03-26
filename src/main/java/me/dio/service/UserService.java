package me.dio.service;

import dev.santanderdevweek2023.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
