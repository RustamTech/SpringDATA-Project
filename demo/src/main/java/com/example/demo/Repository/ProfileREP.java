package com.example.demo.Repository;
import com.example.demo.Config.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ProfileREP extends JpaRepository<ProfileEntity, Long> {
}
