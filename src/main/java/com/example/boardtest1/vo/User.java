package com.example.boardtest1.vo;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num")
    private Long userNum;

    private String id;
    private String password;
    private String name;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "last_login_date")
    private Date lastLoginDate;
}
