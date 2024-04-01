package com.example.mapper;

import com.example.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAllUsers();

    User getUserById(Long id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
