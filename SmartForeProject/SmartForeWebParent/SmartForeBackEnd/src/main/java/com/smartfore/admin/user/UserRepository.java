package com.smartfore.admin.user;

import org.springframework.data.repository.CrudRepository;

import com.smartfore.common.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
