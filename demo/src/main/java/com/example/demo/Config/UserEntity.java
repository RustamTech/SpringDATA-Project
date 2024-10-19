package com.example.demo.Config;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String email;


    @OneToMany(mappedBy = "assignedUser", cascade = CascadeType.ALL)
    private List<TaskEntity> tasks;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private ProfileEntity profile;
    // we dont use mappedBy because this 1-1 connection
}

