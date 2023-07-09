package com.example.boardtest1.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDao {
    @JsonProperty("title")
    private String title;
    @JsonProperty("userNum")
    private String userNum;
    @JsonProperty("content")
    private String content;
}
