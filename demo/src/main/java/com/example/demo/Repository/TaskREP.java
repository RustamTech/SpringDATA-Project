package com.example.demo.Repository;
import com.example.demo.Config.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskREP extends JpaRepository<TaskEntity, Long> {
}
