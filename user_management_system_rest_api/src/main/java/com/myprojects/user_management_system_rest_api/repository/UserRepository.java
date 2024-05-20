package com.myprojects.user_management_system_rest_api.repository;

import com.myprojects.user_management_system_rest_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
