package com.example.demo.Repository;

import com.example.demo.Config.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface  UserREP extends JpaRepository<UserEntity,Long> {
}
