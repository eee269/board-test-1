package com.example.boardtest1.vo;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Entity
@Getter
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num")
    private Long replyNum;
    private Long userNum;
    private Long boardNum;
    private String content;
    private Date createdDate;
    private Date modifiedDate;
    private Boolean privateFlag;
    private Long refReplyNum;
}
