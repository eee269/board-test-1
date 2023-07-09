package com.example.boardtest1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
    @JsonProperty("title")
    private String title;
    @JsonProperty("userNum")
    private String userNum;
    @JsonProperty("content")
    private String content;
}
