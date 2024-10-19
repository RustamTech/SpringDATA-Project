package com.example.demo.Repository;

import com.example.demo.Config.ProjectEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectREP extends JpaRepository<ProjectEntity, Long> {
}
